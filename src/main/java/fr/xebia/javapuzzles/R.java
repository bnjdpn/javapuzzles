package fr.xebia.javapuzzles;

public class R {

    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            System.exit(0);
            double d = 5 / 0;
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}
