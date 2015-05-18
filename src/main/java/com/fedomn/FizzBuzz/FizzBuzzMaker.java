package com.fedomn.FizzBuzz;

public class FizzBuzzMaker {


    public static String translate(int number) {
        WordHandler commonNumberHandler = new CommonNumberHandler(null);
        WordHandler buzzHandler = new BuzzHandler(commonNumberHandler);
        WordHandler fizzHandler = new FizzHandler(buzzHandler);
        WordHandler fizzBuzzHandler = new FizzBuzzHandler(fizzHandler);
        return fizzBuzzHandler.handler(number);
    }
}
