package com.modernJava.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /**
         * BJ8 - Before Java 8
         */
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1 > o2 ->  1
                // o1 < o2 -> -1
                // o1 == o2 -> 0
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of my comparator is: " + comparator.compare(3,2));


        /**
         * AJ8 - After Java 8
         */
        Comparator<Integer> comparatorLambda =  (o1, o2) -> o1.compareTo(o2);
        System.out.println("Result of my comparatorLambda is: " + comparator.compare(3,2));
    }
}
