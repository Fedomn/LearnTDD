package com.fedomn.FizzBuzz;

public class FizzBuzzMaker {


    public static String translate(int number) {
        WordHandler commonNumberHandler = new CommonNumberHandler(null);
        WordHandler FizzHandler = new FizzHandler(commonNumberHandler);
        WordHandler BuzzHandler = new BuzzHandler(FizzHandler);
        WordHandler FizzBuzzHandler = new FizzBuzzHandler(BuzzHandler);
        return FizzBuzzHandler.handler(number);

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
