package fr.xebia.javapuzzles.booleans;

public class True {

    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf("True");
        Boolean b2 = Boolean.valueOf("1");
        System.out.println(b1 & b2);
    }
}
