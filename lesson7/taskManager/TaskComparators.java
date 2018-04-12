package com.oprotsen.JavaOOP.lesson7.taskManager;

import java.util.Comparator;

public class TaskComparators {

    public static Comparator<Task> byName() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task a, Task b) {
                return a.getName().compareTo(b.getName());
            }
        };
    }

    public static Comparator<Task> byDeadline() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task a, Task b) {
                return a.getDeadline().compareTo(b.getDeadline());
            }
        };
    }

    public static Comparator<Task> byPriority() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task a, Task b) {
                return a.getPriority().compareTo(b.getPriority());
            }
        };
    }

}
