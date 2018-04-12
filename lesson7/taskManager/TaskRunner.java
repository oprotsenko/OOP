package com.oprotsen.JavaOOP.lesson7.taskManager;

import java.time.LocalDate;
import java.util.Comparator;

public class TaskRunner {
    public static void main(String[] args) {

        Task task1 = new Task(001, "Film", "nfkjgnlf", LocalDate.of(2018, 3, 30), Priority.MINOR);
        Task task2 = new Task(002, "Movie", "nfkjgnlf", LocalDate.of(2018, 5, 30), Priority.MAJOR);
        Task task3 = new Task(003, "Cartoon", "nfkjgnlf", LocalDate.of(2018, 2, 20), Priority.MINOR);
        Task task4 = new Task(004, "Horror", "nfkjgnlf", LocalDate.of(2018, 6, 30), Priority.NORMAL);
        Task task5 = new Task(005, "Serial", "nfkjgnlf", LocalDate.of(2018, 9, 30), Priority.MINOR);
        Task task6 = new Task(006, "Film", "nfkjgnlf", LocalDate.of(2018, 1, 30), Priority.NORMAL);

        Tasks list = new Tasks();
        list.addTask(task1);
        list.addTask(task2);
        list.addTask(task3);
        list.addTask(task4);
        list.addTask(task5);
        list.addTask(task6);

        list.sort(TaskComparators.byName());
        System.out.println(list);
        list.sort(TaskComparators.byDeadline());
        System.out.println(list);
        System.out.println(list.filter(TaskPredicates.hasExpiredDeadline()));
        System.out.println(list.filter(TaskPredicates.hasPriority(Priority.NORMAL)));
        System.out.println(list.filter(TaskPredicates.nameContains("Fil")));
    }
}
