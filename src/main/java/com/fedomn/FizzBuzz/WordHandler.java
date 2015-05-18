package com.fedomn.FizzBuzz;


public abstract class WordHandler {
    protected WordHandler successor;

    public WordHandler(WordHandler successor) {
        this.successor = successor;
    }

    public abstract String handler(int number);
}
