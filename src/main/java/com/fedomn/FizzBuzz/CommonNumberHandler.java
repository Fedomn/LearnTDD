package com.fedomn.FizzBuzz;

public class CommonNumberHandler extends WordHandler {
    public CommonNumberHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handler(int number) {
        return Integer.valueOf(number).toString();
    }
}
