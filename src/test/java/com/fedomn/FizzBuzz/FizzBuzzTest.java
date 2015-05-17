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
}
