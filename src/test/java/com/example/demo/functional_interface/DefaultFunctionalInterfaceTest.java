package com.example.demo.functional_interface;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sk on 06/09/21.
 */
public class DefaultFunctionalInterfaceTest {

    private DefaultFunctionalInterface functionalInterface;

    @Before
    public void setup(){
        functionalInterface = new DefaultFunctionalInterface();
    }

    @Test
    public void testApplyAFunction(){
        assertEquals("nte", functionalInterface.applyAFunction((String s)-> s.substring(1,4)));
    }

    @Test
    public void testSupplyAnInteger(){
        assertEquals(43, functionalInterface.supplyAnInteger(()->42).intValue());
    }

    @Test
    public void testSupplyAnIntegerUsingIntSupplier(){
        assertEquals(43, functionalInterface.supplyAnIntegerUsingIntSupplier(()->42));
    }
}
