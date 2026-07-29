pipeline {
    agent any

    triggers {
        pollSCM('H/5 * * * *')
    }

    environment {
        TELEGRAM_BOT_TOKEN = credentials('telegram-bot-token')
        TELEGRAM_CHAT_ID   = credentials('telegram-chat-id')
        USER_NAME          = 'Danil Ushakov'
        DOCKER_HOST        = 'unix:///var/run/docker.sock'
        TESTCONTAINERS_RYUK_DISABLED = 'true'
    }

    stages { 
        stage('Build & Test Backend') {
            agent {
                docker {
                    image 'gradle:8.8-jdk17'
                    args '-v /var/run/docker.sock:/var/run/docker.sock -v gradle-cache:/home/gradle/.gradle'
                }
            }
            steps {
                dir('backend') {
                    sh 'gradle build -x test -x ktlintCheck -x ktlintMainSourceSetCheck -x ktlintGuiSourceSetCheck -x ktlintTestSourceSetCheck'
                }
            }
            post {
                always {
                    junit allowEmptyResults: true, testResults: 'backend/build/test-results/test/*.xml'
                }
            }
        }

        stage('Build Frontend') {
            agent {
                docker {
                    image 'node:18-alpine'
                }
            }
            steps {
                dir('frontend') {
                    sh '''
                        export NODE_OPTIONS=--openssl-legacy-provider
                        npm install
                        npm run build
                    '''
                }
            }
            post {
                always {
                    archiveArtifacts artifacts: 'frontend/build/**', allowEmptyArchive: true
                }
            }
        }

        stage('Save Artifacts & Notify') {
            steps {
                archiveArtifacts artifacts: 'backend/build/libs/*.jar', allowEmptyArchive: true
		echo 'All artifacts saved successfully!'
            }
            post {
                success {
                    sh """
                        curl -X POST -H 'Content-Type: application/json' \\
                        --data '{"chat_id": "${TELEGRAM_CHAT_ID}", "text": "✅ ${USER_NAME} успешно собрал приложение todo-list!"}' \\
                        https://api.telegram.org/bot${TELEGRAM_BOT_TOKEN}/sendMessage
                    """
                }
            }
        }
    }
}