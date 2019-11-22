package fr.xebia.javapuzzles;

public class J {

    private static int x = 2;

    static {
        x++;
    }

    static {
        x -= 2;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }

}
