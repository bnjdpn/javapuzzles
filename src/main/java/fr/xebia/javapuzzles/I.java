package fr.xebia.javapuzzles;

public class I {

    public static void main(String[] args) {
        f((byte) 3 + (byte) 5);
    }

    private static void f(Byte b) {
        System.out.println("Byte");
    }

    private static void f(Number n) {
        System.out.println("Number");
    }
}
