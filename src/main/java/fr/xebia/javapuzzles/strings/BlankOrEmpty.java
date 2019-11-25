package fr.xebia.javapuzzles.strings;

public class BlankOrEmpty {

    public static void main(String[] args) {
        var blank = " ".isBlank();
        var empty = " ".isEmpty();
        System.out.println(blank + " " + empty);
    }

}
