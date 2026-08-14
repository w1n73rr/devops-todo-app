package ru.romanow.todolist.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0017J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/romanow/todolist/service/TodoListServiceImpl;", "Lru/romanow/todolist/service/TodoListService;", "itemRepository", "Lru/romanow/todolist/repository/ItemRepository;", "(Lru/romanow/todolist/repository/ItemRepository;)V", "create", "", "userId", "", "request", "Lru/romanow/todolist/model/CreateItemRequest;", "delete", "uid", "Ljava/util/UUID;", "findAll", "", "Lru/romanow/todolist/model/ListItem;", "backend-todo-list"})
public class TodoListServiceImpl implements ru.romanow.todolist.service.TodoListService {
    @org.jetbrains.annotations.NotNull()
    private final ru.romanow.todolist.repository.ItemRepository itemRepository = null;
    
    public TodoListServiceImpl(@org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.repository.ItemRepository itemRepository) {
        super();
    }
    
    @io.micrometer.core.annotation.Timed(value = "find-all")
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<ru.romanow.todolist.model.ListItem> findAll(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @io.micrometer.core.annotation.Timed(value = "create")
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.model.CreateItemRequest request) {
    }
    
    @io.micrometer.core.annotation.Timed(value = "delete")
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.util.UUID uid) {
    }
}