package fr.xebia.javapuzzles;

public class K {

    public static void main(String[] args) {
        for (int i = 0; i < 1; i = plusplusi(i)) {
            System.out.println("t1");
        }
    }

    private static int plusplusi(int i) {
        System.out.println("t2");
        return ++i;
    }

}
