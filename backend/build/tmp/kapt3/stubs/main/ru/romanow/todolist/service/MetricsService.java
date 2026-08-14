package ru.romanow.todolist.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0012J\b\u0010\u000b\u001a\u00020\nH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/romanow/todolist/service/MetricsService;", "Lio/micrometer/core/instrument/binder/MeterBinder;", "itemRepository", "Lru/romanow/todolist/repository/ItemRepository;", "(Lru/romanow/todolist/repository/ItemRepository;)V", "bindTo", "", "registry", "Lio/micrometer/core/instrument/MeterRegistry;", "itemsCount", "", "usersCount", "backend-todo-list"})
public class MetricsService implements io.micrometer.core.instrument.binder.MeterBinder {
    @org.jetbrains.annotations.NotNull()
    private final ru.romanow.todolist.repository.ItemRepository itemRepository = null;
    
    public MetricsService(@org.jetbrains.annotations.NotNull()
    ru.romanow.todolist.repository.ItemRepository itemRepository) {
        super();
    }
    
    @java.lang.Override()
    public void bindTo(@org.jetbrains.annotations.NotNull()
    io.micrometer.core.instrument.MeterRegistry registry) {
    }
    
    private long usersCount() {
        return 0L;
    }
    
    private long itemsCount() {
        return 0L;
    }
}