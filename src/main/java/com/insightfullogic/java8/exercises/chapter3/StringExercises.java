package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringExercises {

    // Question 7
    public static int countLowercaseLetters(String string) {
        return string.chars().filter(Character::isLowerCase).sum();
    }

    // Question 8
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream().max(Comparator.comparing(StringExercises::countLowercaseLetters));
    }

}
