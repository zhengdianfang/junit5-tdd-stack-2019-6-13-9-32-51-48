package com.thoughtworks.tdd;

import org.junit.Assert;
import org.junit.Test;


public class GameTest {

    @Test
    public void should_Fizz_when_input_multi_three() {
        Game game = new Game();
        String str = game.fizzBuzz(9);
        Assert.assertEquals(str, "Fizz");

    }

    @Test
    public void should_Buzz_when_input_multi_five() {
        Game game = new Game();
        String str = game.fizzBuzz(25);
        Assert.assertEquals(str, "Buzz");

    }

    @Test
    public void should_Whizz_when_input_multi_seven() {
        Game game = new Game();
        String str = game.fizzBuzz(49);
        Assert.assertEquals(str, "Whizz");

    }

    @Test
    public void should_FizzBuzz_when_input_multi_three_and_multi_five() {
        Game game = new Game();
        String str = game.fizzBuzz(15);
        Assert.assertEquals(str, "FizzBuzz");

    }

    @Test
    public void should_FizzWhizz_when_input_multi_three_and_multi_seven() {
        Game game = new Game();
        String str = game.fizzBuzz(21);
        Assert.assertEquals(str, "FizzWhizz");

    }

    @Test
    public void should_BuzzWhizz_when_input_multi_five_and_multi_seven() {
        Game game = new Game();
        String str = game.fizzBuzz(35);
        Assert.assertEquals(str, "BuzzWhizz");

    }

    @Test
    public void should_number_when_input_not_each_multi() {
        Game game = new Game();
        String str = game.fizzBuzz(4);
        Assert.assertEquals(str, "4");

    }
}