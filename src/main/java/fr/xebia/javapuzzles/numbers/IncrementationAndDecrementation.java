package fr.xebia.javapuzzles.numbers;

public class IncrementationAndDecrementation {

    public static void main(String[] args) {
        int i = 0;
        int s = (++i) + (i--) + i;
        System.out.println(s);
    }


}
