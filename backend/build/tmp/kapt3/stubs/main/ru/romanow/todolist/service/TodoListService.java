package ru.romanow.todolist.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lru/romanow/todolist/service/TodoListService;", "", "create", "", "userId", "", "request", "Lru/romanow/todolist/model/CreateItemRequest;", "delete", "uid", "Ljava/util/UUID;", "findAll", "", "Lru/romanow/todolist/model/ListItem;", "backend-todo-list"})
public abstract interface TodoListService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ru.romanow.todolist.model.ListItem> findAll(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    public abstract void create(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.model.CreateItemRequest request);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.util.UUID uid);
}