package com.fedomn.FizzBuzz;

public class FizzBuzzMaker {


    public static String translate(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.valueOf(number).toString();
    }
}
