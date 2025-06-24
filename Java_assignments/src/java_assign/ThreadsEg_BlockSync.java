package java_assign;

class Counter1 {
    private int count = 0;

    public synchronized void increment() {
//        Synchronized block

        synchronized (this){
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class ThreadsEg_BlockSync {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
