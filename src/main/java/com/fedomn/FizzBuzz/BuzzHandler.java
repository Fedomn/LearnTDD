package com.fedomn.FizzBuzz;

public class BuzzHandler extends WordHandler {
    public BuzzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handler(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return successor.handler(number);
        }
    }
}
