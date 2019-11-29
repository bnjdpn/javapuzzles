package fr.xebia.javapuzzles.misc;

public class DoubleReturn {

    public static void main(String[] args) {
        System.out.println(decision());
    }

    private static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }

}
