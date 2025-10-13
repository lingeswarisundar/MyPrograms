class MyThread implements Runnable {
    public void run() {
        System.out.println("Runnable Interface");
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        t1.start();
    }
}
