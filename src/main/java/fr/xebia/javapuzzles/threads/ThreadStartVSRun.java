package fr.xebia.javapuzzles.threads;

public class ThreadStartVSRun implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadStartVSRun());
        t.start();
        System.out.println("2");
        t.run();
        System.out.println("3");
    }

    @Override
    public void run() {
        System.out.println("1");
    }
}
