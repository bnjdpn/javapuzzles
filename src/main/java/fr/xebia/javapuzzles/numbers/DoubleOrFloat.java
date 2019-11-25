package fr.xebia.javapuzzles.numbers;

public class DoubleOrFloat {

    public static void main(String[] args) {
        f(3.0);
    }

    private static void f(Double d) {
        System.out.println("Double");
    }

    private static void f(Float f) {
        System.out.println("Float");
    }
}
