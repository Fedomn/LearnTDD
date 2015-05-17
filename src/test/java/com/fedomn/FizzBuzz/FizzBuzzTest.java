package com.fedomn.FizzBuzz;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FizzBuzzTest {


    @Test
    public void GIVEN_One_SHOULDE_SayOne() {
        assertEquals("Failure - given 1 should say 1", "1", FizzBuzzMaker.translate(1));
    }

    @Test
    public void GIVEN_Three_SHOULD_SayFizz() {
        assertEquals("Failure - given 3 should say Fizz", "Fizz", FizzBuzzMaker.translate(3));
    }

    @Test
    public void GIVEN_Five_SHOULD_SayBuzz() {
        assertEquals("Failure - given 5 should say Buzz", "Buzz", FizzBuzzMaker.translate(5));
    }

    @Test
    public void GIVEN_Fifteen_SHOULD_SayFizzBuzz() {
        assertEquals("Failure - given 15 should say FizzBuzz", "FizzBuzz", FizzBuzzMaker.translate(15));
    }

}
