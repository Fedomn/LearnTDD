package com.fedomn.FizzBuzz;

/**
 * Created by fedomn on 2015/5/31.
 */
public class WhizzHandler extends WordHandler {
    public WhizzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handler(int number) {
        if (number % 7 == 0) {
            return "Whizz";
        } else {
            return successor.handler(number);
        }
    }
}
