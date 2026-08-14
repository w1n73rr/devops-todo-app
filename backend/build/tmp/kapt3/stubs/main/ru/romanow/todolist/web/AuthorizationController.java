package ru.romanow.todolist.web;

@io.swagger.v3.oas.annotations.Hidden()
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/callback"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/romanow/todolist/web/AuthorizationController;", "", "oauthLoginProperties", "Lru/romanow/todolist/config/properties/OAuthLoginProperties;", "(Lru/romanow/todolist/config/properties/OAuthLoginProperties;)V", "items", "Lorg/springframework/http/ResponseEntity;", "Ljava/lang/Void;", "token", "Lorg/springframework/security/oauth2/client/authentication/OAuth2AuthenticationToken;", "backend-todo-list"})
public class AuthorizationController {
    @org.jetbrains.annotations.NotNull()
    private final ru.romanow.todolist.config.properties.OAuthLoginProperties oauthLoginProperties = null;
    
    public AuthorizationController(@org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.config.properties.OAuthLoginProperties oauthLoginProperties) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<java.lang.Void> items(@org.jetbrains.annotations.NotNull()
    org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken token) {
        return null;
    }
}