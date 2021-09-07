package com.example.demo.streams;

import com.example.demo.behaviour_param.Apple;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sk on 08/09/21.
 */
public class SampleDataStructures {

    public List<Apple> collectGrenApples(List<Apple> apples){
        return apples.stream().filter(a -> "green".equals(a.getColour())).collect(Collectors.toList());
    }
}
