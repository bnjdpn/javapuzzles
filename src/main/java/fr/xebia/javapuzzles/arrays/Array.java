package fr.xebia.javapuzzles.arrays;

public class Array {

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        int[] y = {0, 1, 3};
        System.out.println(x[(x = y)[2]]);
    }
}
