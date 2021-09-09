package com.example.demo.methodReference;

import com.example.demo.behaviour_param.Apple;

import java.util.List;

/**
 * Created by sk on 09/09/21.
 */
public class DemoMethodReference {

    public void someSample(List<Apple> apples) {
        apples.stream().forEach(System.out::println);
    }
}
