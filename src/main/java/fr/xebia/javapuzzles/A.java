package fr.xebia.javapuzzles;

public class A {

    public static void main(String[] args) {
        f(1, Integer.MAX_VALUE + 1);
    }

    private static void f(int v1, int v2) {
        System.out.println("1");
    }

    private static void f(int... v) {
        System.out.println("2");
    }
}
