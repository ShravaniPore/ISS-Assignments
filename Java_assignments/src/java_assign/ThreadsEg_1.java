package java_assign;


import java.sql.SQLOutput;

// By extending Thread class
class Thread1 extends Thread {
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("This is thread 1 (Extends Thread).");
        }
    }
}

class Thread2 extends Thread {
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("This is thread 2 (Extends Thread).");
        }
    }
}

//By implementing Runnable interface
class Runnable1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("This is Runnable 1 (implements Runnable).");
        }
    }
}

class Runnable2 implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("This is Runnable 2 (implements Runnable).");
        }
    }
}

class VolatileExample extends Thread{
    volatile boolean running=true;

    public void run() {
        System.out.println("Volatile thread started executing.");
        while(running){
//            System.out.println("Volatile thread is running.");
        }
        System.out.println("Volatile thread stopped executing..");
    }

    public void stopRunning(){
        running=false;
    }
}

public class ThreadsEg_1 {
    public static void main(String[] args) {
//      using thread class
        Thread1 thread1=new Thread1();
        Thread2 thread2= new Thread2();

        thread1.start();
        thread2.start();

//        using runnable interface
        Runnable threadOne = new Runnable1();
        Runnable threadTwo = new Runnable2();

        Thread t1 = new Thread(threadOne);
        Thread t2 = new Thread(threadTwo);

        t1.start();
        t2.start();

        VolatileExample vthread=new VolatileExample();
        vthread.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        vthread.stopRunning();
        System.out.println("Main function asked volatile thread to stop.");
    }

}
