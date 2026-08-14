package ru.romanow.todolist.config;

@org.springframework.context.annotation.Configuration()
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {ru.romanow.todolist.config.properties.OAuthLoginProperties.class, ru.romanow.todolist.config.properties.ActuatorSecurityProperties.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lru/romanow/todolist/config/SecurityConfiguration;", "", "actuatorSecurityProperties", "Lru/romanow/todolist/config/properties/ActuatorSecurityProperties;", "(Lru/romanow/todolist/config/properties/ActuatorSecurityProperties;)V", "disabledSecurityFilterChain", "Lorg/springframework/security/web/SecurityFilterChain;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "managementSecurityFilterChain", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "protectedResourceSecurityFilterChain", "properties", "Lorg/springframework/boot/autoconfigure/security/oauth2/client/OAuth2ClientProperties;", "tokenSecurityFilterChain", "users", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "Companion", "backend-todo-list"})
public class SecurityConfiguration {
    @org.jetbrains.annotations.NotNull()
    private final ru.romanow.todolist.config.properties.ActuatorSecurityProperties actuatorSecurityProperties = null;
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> PROVIDERS = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.romanow.todolist.config.SecurityConfiguration.Companion Companion = null;
    
    public SecurityConfiguration(@org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.config.properties.ActuatorSecurityProperties actuatorSecurityProperties) {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.springframework.core.annotation.Order(value = 1)
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"oauth2.security.enabled"}, havingValue = "true", matchIfMissing = true)
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.web.SecurityFilterChain tokenSecurityFilterChain(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.springframework.core.annotation.Order(value = 2)
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.web.SecurityFilterChain managementSecurityFilterChain(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.springframework.core.annotation.Order(value = 3)
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"oauth2.security.enabled"}, havingValue = "false")
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.web.SecurityFilterChain disabledSecurityFilterChain(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.springframework.core.annotation.Order(value = 3)
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"oauth2.security.enabled"}, havingValue = "true", matchIfMissing = true)
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.web.SecurityFilterChain protectedResourceSecurityFilterChain(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http, @org.jetbrains.annotations.NotNull()
    org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties properties) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.core.userdetails.UserDetailsService users(@org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/romanow/todolist/config/SecurityConfiguration$Companion;", "", "()V", "FIRST", "", "PROVIDERS", "", "", "SECOND", "THIRD", "backend-todo-list"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}