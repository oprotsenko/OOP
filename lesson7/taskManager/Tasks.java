package com.oprotsen.JavaOOP.lesson7.taskManager;

import com.oprotsen.JavaOOP.lesson7.predicate.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tasks {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void sort(Comparator<Task> comparator) {
        for (int i = 1; i < tasks.size(); i++) {
           tasks.sort(comparator);
        }
    }
    public Tasks filter(Predicate<Task> predicate) {
        Tasks filtered = new Tasks();
        for (Task elem: tasks) {
            if (predicate.test(elem))
                filtered.addTask(elem);
        }
        return filtered;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}
