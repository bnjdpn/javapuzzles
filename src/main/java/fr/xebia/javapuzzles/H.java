package fr.xebia.javapuzzles;

public class H implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new H());
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
