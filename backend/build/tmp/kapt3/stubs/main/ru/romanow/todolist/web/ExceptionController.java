package ru.romanow.todolist.web;

@io.swagger.v3.oas.annotations.Hidden()
@org.springframework.web.bind.annotation.RestControllerAdvice()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0017J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0014H\u0017R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/romanow/todolist/web/ExceptionController;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "badRequest", "Lru/romanow/todolist/model/ValidationErrorResponse;", "exception", "Lorg/springframework/web/bind/MethodArgumentNotValidException;", "buildErrors", "", "Lru/romanow/todolist/model/ErrorDescription;", "bindingResult", "Lorg/springframework/validation/BindingResult;", "buildMessage", "", "handleException", "Lru/romanow/todolist/model/ErrorResponse;", "Ljava/lang/RuntimeException;", "Lru/romanow/todolist/exceptions/ItemAlreadyExistsException;", "backend-todo-list"})
public class ExceptionController {
    private final org.slf4j.Logger logger = null;
    
    public ExceptionController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {org.springframework.web.bind.MethodArgumentNotValidException.class})
    @org.jetbrains.annotations.NotNull()
    public ru.romanow.todolist.model.ValidationErrorResponse badRequest(@org.jetbrains.annotations.NotNull()
    org.springframework.web.bind.MethodArgumentNotValidException exception) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CONFLICT)
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ru.romanow.todolist.exceptions.ItemAlreadyExistsException.class})
    @org.jetbrains.annotations.NotNull()
    public ru.romanow.todolist.model.ErrorResponse handleException(@org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.exceptions.ItemAlreadyExistsException exception) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.lang.RuntimeException.class})
    @org.jetbrains.annotations.NotNull()
    public ru.romanow.todolist.model.ErrorResponse handleException(@org.jetbrains.annotations.NotNull()
    java.lang.RuntimeException exception) {
        return null;
    }
    
    private java.lang.String buildMessage(org.springframework.validation.BindingResult bindingResult) {
        return null;
    }
    
    private java.util.List<ru.romanow.todolist.model.ErrorDescription> buildErrors(org.springframework.validation.BindingResult bindingResult) {
        return null;
    }
}