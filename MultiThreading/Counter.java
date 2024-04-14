class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + " - Count: " + counter.getCount());
            try {
                Thread.sleep(500); // Simulate some work being done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create threads
        Thread thread1 = new IncrementThread(counter);
        Thread thread2 = new IncrementThread(counter);

        // Start threads
        thread1.start();
        thread2.start();
    }
}
