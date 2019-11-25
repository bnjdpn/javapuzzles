package fr.xebia.javapuzzles.numbers;

public class IntOrShort {

    public static void main(String[] args) {
        m();
    }

    private static void m(int... a) {
        System.out.println("int");
    }

    private static void m(short... b) {
        System.out.println("short");
    }
}
