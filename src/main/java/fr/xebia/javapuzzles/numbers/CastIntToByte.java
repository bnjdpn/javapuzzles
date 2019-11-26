package fr.xebia.javapuzzles.numbers;

public class CastIntToByte {

    public static void main(String[] args) {
        int i = (byte) 3 + (byte) 5;
        f((byte) 3 + (byte) 5);
    }

    private static void f(Byte b) {
        System.out.println("Byte");
    }

    private static void f(Number n) {
        System.out.println("Number");
    }
}
