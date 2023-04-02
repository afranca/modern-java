package com.modernJava.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * BJ8 - Before Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * AJ8 - After Java 8
         */

        Runnable runnableLambdaSimple = () -> System.out.println("Inside Runnable 2");
        new Thread(runnableLambdaSimple).start();

    }
}