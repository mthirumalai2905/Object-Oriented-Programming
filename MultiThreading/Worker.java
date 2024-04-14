package MultiThreading;

class Worker{
    public static void main(String[] args) {
        Thread thread1 = new PrintLettersThread();
        Thread thread2 = new PrintLettersThreader();

        thread1.start();
        thread2.start();
    }
}

class PrintLettersThread extends Thread{
    public void run(){
        try{
            for(int i = 1; i <= 5; i++){
                System.out.println("Thread 1: " +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.err.println("PrintNumbersThread was interrupted");
        }
        System.out.println("Thread 1 finished");
    }
}

class PrintLettersThreader extends Thread{
    public void run(){
        try{
            for(int i = 1; i < 5; i++){
                System.out.println("Thread 2: "+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.err.println("PrintLettersThread was interrupted");
        }
        System.out.println("Thread 2 finished");
    }
}