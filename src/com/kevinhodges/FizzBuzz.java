package com.kevinhodges;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(42));
    }

    public String fizzBuzz(int number) {

        if (number % 15 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        String numberString = Integer.toString(number);

        return numberString;
    }
}
