package fr.xebia.javapuzzles.misc;

public class Static {

    private static int x = 2;

    static {
        x++;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }

    static {
        x -= 2;
    }

}
