package fr.xebia.javapuzzles.numbers;

public class Octal {

    public static void main(String[] args) {
        int a = 16;

        String s = switch (a) {
            case 020 -> "A";
            case 016 -> "B";
            default -> "C";
        };

        System.out.println(s);
    }

}
