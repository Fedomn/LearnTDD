package com.fedomn.FizzBuzz;


public class FizzBuzzHandler extends WordHandler {
    public FizzBuzzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handler(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }else {
            return successor.handler(number);
        }
    }
}
