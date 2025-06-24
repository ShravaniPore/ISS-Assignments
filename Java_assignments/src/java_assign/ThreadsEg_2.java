package java_assign;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//Thread pool executor example
class MyTask implements Runnable {
    private int taskNumber;

    public MyTask(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println("Task "+ taskNumber + " is being executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task "+taskNumber + " completed by " + Thread.currentThread().getName());
    }
}

public class ThreadsEg_2 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(int i=1;i<=5;i++){
            MyTask task=new MyTask(i);
            executor.execute(task);
        }

        executor.shutdown();
    }
}
