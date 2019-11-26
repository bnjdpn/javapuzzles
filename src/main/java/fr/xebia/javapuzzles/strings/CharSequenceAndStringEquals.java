package fr.xebia.javapuzzles.strings;

public class CharSequenceAndStringEquals {

    public static void main(String[] args) {
        CharSequence a = "21";
        String b = "21".substring(0);
        System.out.println(a == b);

        CharSequence c = "21";
        String d = "121".substring(1);
        System.out.println(c == d);
    }
}
