package com.example.demo.methodReference;

import com.example.demo.behaviour_param.Apple;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sk on 09/09/21.
 */
public class DemoMethodReferenceTest {

    private DemoMethodReference reference;
    private List<Apple> apples;


    @Before
    public void setUp() throws Exception {
        reference = new DemoMethodReference();
        apples = Arrays.asList(new Apple("green", 99), new Apple("red", 150), new Apple("green", 150),
                new Apple("yellow", 200), new Apple("green", 210), new Apple("yellow", 300));
    }

    @Test
    public void testMethodReference(){
        reference.someSample(apples);
    }
}