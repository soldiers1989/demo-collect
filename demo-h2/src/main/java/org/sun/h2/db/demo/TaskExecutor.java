package org.sun.h2.db.demo;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskExecutor {

    public static TaskExecutor instance;

    static {
        instance = new TaskExecutor();
    }

    private ExecutorService executor = Executors.newFixedThreadPool(4, new ThreadFactoryBuilder().setNameFormat("Work.Item").build());

    public Future<Void> submitWorkItem(Callable task){
        return executor.submit(task);
    }

}
