package fr.xebia.javapuzzles.misc;

import java.util.function.Predicate;

public class PredicateSample {

    Predicate<Integer> predicate = o -> o < -o;

}
