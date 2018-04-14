package com.oprotsen.JavaOOP.lesson8.cleaner;

import com.oprotsen.JavaOOP.lesson7.taskManager.Priority;
import com.oprotsen.JavaOOP.lesson7.taskManager.Task;
import com.oprotsen.JavaOOP.lesson7.taskManager.TaskPredicates;
import com.oprotsen.JavaOOP.lesson7.taskManager.Tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CleanerRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Music");
        list.add("Movie");
        list.add(null);
        list.add("Cartoon");
        Cleaner.removeNulls(list);
        System.out.println(list);

       Tasks tasks = new Tasks();
       tasks.addTask(new Task(001, "Film", "nfkjgnlf", LocalDate.of(2018, 3, 30), Priority.MINOR));
       tasks.addTask(new Task(002, "Movie", "nfkjgnlf", LocalDate.of(2018, 5, 30), Priority.MAJOR));
       tasks.addTask(new Task(003, "Cartoon", "nfkjgnlf", LocalDate.of(2018, 2, 20), Priority.MINOR));
       tasks.addTask(new Task(004, "Horror", "nfkjgnlf", LocalDate.of(2018, 6, 30), Priority.NORMAL));
       tasks.addTask(new Task(005, "Serial", "nfkjgnlf", LocalDate.of(2018, 9, 30), Priority.MINOR));


        Cleaner.remove(tasks.getTasks(), TaskPredicates.hasPriority(Priority.MINOR));
        System.out.println(tasks);
    }
}
