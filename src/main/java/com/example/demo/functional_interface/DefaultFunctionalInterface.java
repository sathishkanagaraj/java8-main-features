package com.example.demo.functional_interface;

import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * Created by sk on 06/09/21.
 */
public class DefaultFunctionalInterface {

    /**
     * Java 8 has default Functional Interfaces, find below for the examples.
     */

    /**
     * The function substring applied for the input 'Intellij'
     */
    public String applyAFunction(Function<String, String> someFunction) {

        return someFunction.apply("Intellij");
    }

    /**
     * Supply an Integer and get it 1 incremented.
     *
     * @param supplier integer
     * @return integer
     */
    public Integer supplyAnInteger(Supplier<Integer> supplier) {

        return supplier.get() + 1;
    }

    /**
     * supplyAnInteger does autoboxing while supplying the incremented value which consumes
     * some memory because autoboxing happens on heap, for that java8 has specific functional interface called
     * 'IntSupplier'.
     */
    public int supplyAnIntegerUsingIntSupplier(IntSupplier intSupplier) {
        return intSupplier.getAsInt() + 1;
    }
}
