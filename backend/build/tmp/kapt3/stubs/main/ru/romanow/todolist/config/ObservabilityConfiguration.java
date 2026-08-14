package ru.romanow.todolist.config;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017\u00a8\u0006\n"}, d2 = {"Lru/romanow/todolist/config/ObservabilityConfiguration;", "", "()V", "noActuatorObservations", "Lio/micrometer/observation/ObservationPredicate;", "noSecurityObservations", "timedAspect", "Lio/micrometer/core/aop/TimedAspect;", "registry", "Lio/micrometer/core/instrument/MeterRegistry;", "backend-todo-list"})
public class ObservabilityConfiguration {
    
    public ObservabilityConfiguration() {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public io.micrometer.core.aop.TimedAspect timedAspect(@org.jetbrains.annotations.NotNull()
    io.micrometer.core.instrument.MeterRegistry registry) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"management.tracing.enabled"}, havingValue = "true")
    @org.jetbrains.annotations.NotNull()
    public io.micrometer.observation.ObservationPredicate noActuatorObservations() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"management.tracing.enabled"}, havingValue = "true")
    @org.jetbrains.annotations.NotNull()
    public io.micrometer.observation.ObservationPredicate noSecurityObservations() {
        return null;
    }
}