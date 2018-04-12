package com.oprotsen.JavaOOP.lesson7.taskManager;

import java.time.LocalDate;
import java.util.function.Predicate;

public class TaskPredicates {
    public static Predicate<Task> nameContains(String substring) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getName().contains(substring);
            }
        };
    }

    public static Predicate<Task> hasExpiredDeadline() {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getDeadline().isBefore(LocalDate.now());
            }
        };
    }

    public static Predicate<Task> hasPriority(Priority priority) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getPriority().equals(priority);
            }
        };
    }

}
