package fr.xebia.javapuzzles.misc;

public class ImplicitThis {

    void foo(ImplicitThis this, String that) {
    }

    void bar(String that) {
        foo(that);
    }

}
