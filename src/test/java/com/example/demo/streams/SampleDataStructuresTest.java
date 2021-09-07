package com.example.demo.streams;

import com.example.demo.behaviour_param.Apple;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by sk on 08/09/21.
 */
public class SampleDataStructuresTest {

    private SampleDataStructures structures;
    private List<Apple> apples;

    @Before
    public void setup(){
        structures = new SampleDataStructures();
        apples = Arrays.asList(new Apple("green", 99), new Apple("red", 150), new Apple("green", 150),
                new Apple("yellow", 200), new Apple("green", 210), new Apple("yellow", 300));
    }

    @Test
    public void testGreenApplesAloneCollected(){
        final List<Apple> collectGrenApples = structures.collectGrenApples(structures.collectGrenApples(apples));
        assertEquals(3, collectGrenApples.size());
    }
}
