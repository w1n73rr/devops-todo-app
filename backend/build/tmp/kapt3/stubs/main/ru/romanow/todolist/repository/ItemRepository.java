package ru.romanow.todolist.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lru/romanow/todolist/repository/ItemRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lru/romanow/todolist/domain/Item;", "Ljava/util/UUID;", "countDistinctByUser", "", "backend-todo-list"})
public abstract interface ItemRepository extends org.springframework.data.jpa.repository.JpaRepository<ru.romanow.todolist.domain.Item, java.util.UUID> {
    
    @org.springframework.data.jpa.repository.Query(value = "select count(distinct i.userId) from Item i")
    public abstract long countDistinctByUser();
}