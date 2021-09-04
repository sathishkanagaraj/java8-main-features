package com.example.demo.behaviour_param;

/**
 * Created by sk on 02/09/21.
 */
public class AppleGreenColourPredicate implements ApplePredicate {
    @Override
    public boolean apply(Apple apple) {
        return "green".equals(apple.getColour());
    }
}
