package fr.xebia.javapuzzles.loops;

public class For {

    public static void main(String[] args) {
        int increment = -1;

        for (int i = 0, j = 0; i < 10 & j < 5; i++, j += 2) {
            increment++;
        }

        System.out.println(increment);
    }

}
