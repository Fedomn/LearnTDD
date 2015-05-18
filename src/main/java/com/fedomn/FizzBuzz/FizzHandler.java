package com.fedomn.FizzBuzz;


public class FizzHandler extends WordHandler {
    public FizzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handler(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return successor.handler(number);
        }
    }
}
