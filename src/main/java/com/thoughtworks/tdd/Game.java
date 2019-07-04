package com.thoughtworks.tdd;

public class Game {

    public String fizzBuzz(int number) {
        StringBuffer result = new StringBuffer();
        result.append(translateThreeMultiple(number));
        result.append(translateFiveMultiple(number));
        result.append(translateSevenMultiple(number));
        if(result.toString().isEmpty()) {
           return String.valueOf(number);
        }
        return result.toString();
    }

    private String translateThreeMultiple(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }

    private String translateFiveMultiple(int number) {
        return number % 5 == 0 ? "Buzz" : "";
    }

    private String translateSevenMultiple(int number) {
        return number % 7 == 0 ? "Whizz" : "";
    }
}
