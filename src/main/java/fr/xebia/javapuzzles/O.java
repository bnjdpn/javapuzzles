package fr.xebia.javapuzzles;

public class O {

    public static void main(String[] args) {
        f(Integer.MAX_VALUE + 1, Integer.MIN_VALUE - 1);
    }

    private static void f(long... v) {
        System.out.println("long");
    }

    private static void f(int v1, int v2) {
        System.out.println("int");
    }
}
