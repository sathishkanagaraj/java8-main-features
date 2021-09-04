package com.example.demo.behaviour_param;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by sk on 02/09/21.
 */
public class BehaviourParamTest {

    private BehaviourParam behaviourParam;
    private List<Apple> apples;
    private List<Car> cars;

    @Before
    public void setup() {
        behaviourParam = new BehaviourParam();
        apples = Arrays.asList(new Apple("green", 99), new Apple("red", 150), new Apple("green", 150),
                new Apple("yellow", 200), new Apple("green", 210), new Apple("yellow", 300));
        cars = Arrays.asList(new Car("brio", "honda"), new Car("city", "honda"), new Car("i20", "hyundai"),
                new Car("duster", "Renault"), new Car("namo", "tata"));
    }

    @Test
    public void testFilterGreenApples() {
        final List<Apple> greenApples = behaviourParam.filterApples(new AppleGreenColourPredicate(), apples);
        assertEquals(3, greenApples.size());
    }

    @Test
    public void testFilterApplesWeighMoreThan200Kg() {
        final List<Apple> greenApples = behaviourParam.filterApples(new AppleHeavyWeightPredicate(), apples);
        assertEquals(3, greenApples.size());
    }

    @Test
    public void testFilterApplesUsingLambda() {
        final List<Apple> greenApples = behaviourParam.usingLambdaFilterGreenApples(apples);
        assertEquals(3, greenApples.size());
    }

    @Test
    public void testFilterYellowApplesUsingGenericLambda() {
        final List<Apple> yellowApples = behaviourParam.genericFilterUsingLambda(
                (Apple a) -> "yellow".equals(a.getColour()), apples);
        assertEquals(2, yellowApples.size());
    }

    @Test
    public void testFilterApplesWeighMoreThan200UsingGenericLambda() {
        final List<Apple> applesWeighMoreThan200 = behaviourParam.genericFilterUsingLambda(
                (Apple a) -> a.getWeight() > 200, apples);
        assertEquals(2, applesWeighMoreThan200.size());
    }

    @Test
    public void testFilterHondaCarsUsingGenericLambda() {
        final List<Car> hondaCars = behaviourParam.genericFilterUsingLambda(
                (Car car) -> car.getBrand().equals("honda"), cars);
        assertEquals(2, hondaCars.size());
    }
}
