package ru.romanow.todolist.web;

@io.swagger.v3.oas.annotations.Hidden()
@org.springframework.web.bind.annotation.RestController()
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(prefix = "index-page", name = {"enabled"}, havingValue = "true")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lru/romanow/todolist/web/IndexController;", "", "applicationName", "", "(Ljava/lang/String;)V", "index", "backend-todo-list"})
public class IndexController {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String applicationName = null;
    
    public IndexController(@org.springframework.beans.factory.annotation.Value(value = "${spring.application.name}")
    @org.jetbrains.annotations.NotNull()
    java.lang.String applicationName) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(produces = {"text/plain"})
    @org.jetbrains.annotations.NotNull()
    public java.lang.String index() {
        return null;
    }
}