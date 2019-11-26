package fr.xebia.javapuzzles.threads;

public class ThreadStartVSRun implements Runnable {

    /*
     * "2", "1" et "3" vont s'afficher dans l'ordre.
     * Le "1" de run() va s'afficher avant ou après suivant l'exécution du thread (déterminé par l'OS)
     */
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
