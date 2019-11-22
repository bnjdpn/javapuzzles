package fr.xebia.javapuzzles;

public class E {

    public static void main(String[] args) {
        int s = 0;

        for (byte b = 0; b < 128; b++) {
            s += 1;
        }

        System.out.println(s);
    }

}
