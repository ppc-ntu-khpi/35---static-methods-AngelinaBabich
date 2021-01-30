package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        String pText="Hello, world!";
        String pKey="abcdefg";
        System.out.println("text: "+pText);
        System.out.println("key: "+pKey);
        System.out.println("encoded text: "+Exercise.Calculate(pText, pKey));
    }
}
