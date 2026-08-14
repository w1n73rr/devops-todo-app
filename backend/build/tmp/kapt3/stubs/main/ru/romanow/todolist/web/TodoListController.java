package ru.romanow.todolist.web;

@io.swagger.v3.oas.annotations.tags.Tag(name = "TODO list Controller", description = "\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u044f, \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u044f \u0441\u043f\u0438\u0441\u043a\u0430 \u0438 \u0443\u0434\u0430\u043b\u0435\u043d\u0438\u044f \u043d\u0430\u0434 \u0437\u0430\u043f\u0438\u0441\u044f\u043c\u0438 TODO-\u043b\u0438\u0441\u0442\u0430")
@io.swagger.v3.oas.annotations.security.SecurityScheme(type = io.swagger.v3.oas.annotations.enums.SecuritySchemeType.OAUTH2)
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/public/items"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u001c\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0012J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lru/romanow/todolist/web/TodoListController;", "", "todoListService", "Lru/romanow/todolist/service/TodoListService;", "(Lru/romanow/todolist/service/TodoListService;)V", "create", "Lorg/springframework/http/ResponseEntity;", "Ljava/lang/Void;", "token", "Lorg/springframework/security/oauth2/server/resource/authentication/JwtAuthenticationToken;", "request", "Lru/romanow/todolist/model/CreateItemRequest;", "delete", "", "uid", "Ljava/util/UUID;", "getCurrentUser", "", "items", "", "Lru/romanow/todolist/model/ListItem;", "Companion", "backend-todo-list"})
public class TodoListController {
    @org.jetbrains.annotations.NotNull()
    private final ru.romanow.todolist.service.TodoListService todoListService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DEFAULT_USER = "test@mail.ru";
    @org.jetbrains.annotations.NotNull()
    public static final ru.romanow.todolist.web.TodoListController.Companion Companion = null;
    
    public TodoListController(@org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.service.TodoListService todoListService) {
        super();
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u041f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0435 \u0441\u043f\u0438\u0441\u043a\u0430 \u0437\u0430\u043f\u0438\u0441\u0435\u0439", responses = {@io.swagger.v3.oas.annotations.responses.ApiResponse(description = "\u0421\u043f\u0438\u0441\u043e\u043a \u0432\u0441\u0435\u0445 \u0437\u0430\u043f\u0438\u0441\u0435\u0439 TODO-\u043b\u0438\u0441\u0442\u0430", responseCode = "200", content = {@io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", array = @io.swagger.v3.oas.annotations.media.ArraySchema(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = ru.romanow.todolist.model.ListItem.class)))})})
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"})
    @org.jetbrains.annotations.NotNull()
    public java.util.List<ru.romanow.todolist.model.ListItem> items(@org.jetbrains.annotations.Nullable()
    org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken token) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u0421\u043e\u0437\u0434\u0430\u043d\u0438\u0435 \u043d\u043e\u0432\u043e\u0439 \u0437\u0430\u043f\u0438\u0441\u0438", responses = {@io.swagger.v3.oas.annotations.responses.ApiResponse(description = "\u041d\u043e\u0432\u0430\u044f \u0437\u0430\u043f\u0438\u0441\u044c \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0430", responseCode = "201", headers = {@io.swagger.v3.oas.annotations.headers.Header(name = "Location", description = "\u0421\u0441\u044b\u043b\u043a\u0430 \u043d\u0430 \u0441\u043f\u0438\u0441\u043e\u043a \u0432\u0441\u0435\u0445 \u0437\u0430\u043f\u0438\u0441\u0435\u0439")}), @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "\u041e\u0448\u0438\u0431\u043a\u0430 \u0432\u0430\u043b\u0438\u0434\u0430\u0446\u0438\u0438", responseCode = "400", content = {@io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = ru.romanow.todolist.model.ValidationErrorResponse.class))}), @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "\u0417\u0430\u043f\u0438\u0441\u044c \u0441 \u0442\u0430\u043a\u0438\u043c uid \u0443\u0436\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442", responseCode = "409", content = {@io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = ru.romanow.todolist.model.ErrorResponse.class))})})
    @org.springframework.web.bind.annotation.PostMapping(consumes = {"application/json"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<java.lang.Void> create(@org.jetbrains.annotations.Nullable()
    org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken token, @jakarta.validation.Valid()
    @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.model.CreateItemRequest request) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u0423\u0434\u0430\u043b\u0435\u043d\u0438\u0435 \u0437\u0430\u043f\u0438\u0441\u0438", responses = {@io.swagger.v3.oas.annotations.responses.ApiResponse(description = "\u0417\u0430\u043f\u0438\u0441\u044c \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0443\u0434\u0430\u043b\u0435\u043d\u0430", responseCode = "204")})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{uid}"})
    public void delete(@org.jetbrains.annotations.Nullable()
    org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken token, @org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID uid) {
    }
    
    private java.lang.String getCurrentUser(org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken token) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/romanow/todolist/web/TodoListController$Companion;", "", "()V", "DEFAULT_USER", "", "backend-todo-list"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}