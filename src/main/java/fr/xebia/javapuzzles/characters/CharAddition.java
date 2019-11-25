package fr.xebia.javapuzzles.characters;

public class CharAddition {

    public static void main(String[] args) {
        f('a' + 'b');
    }

    private static void f(int i) {
        System.out.println("int");
    }

    private static void f(char c) {
        System.out.println("char");
    }

}
