package com.example.demo.lambda;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by sk on 05/09/21.
 */
public class ReplaceWithLambdaTest {

    private ReplaceWithLambdas replaceWithLambdas;

    @Before
    public void setup(){
        replaceWithLambdas = new ReplaceWithLambdas();
    }

    @Test
    public void testProcessFile_Sample2Old_noLambda() throws IOException {
        assertEquals("one", replaceWithLambdas.processFile_sample2Old());
        // the behaviour of the method processFile_sample2Old cannot be changed ,
        // functional interface BufferProcessorReader helps to achieve behaviour parameterization.
        // The below tests and its implementation explains the same.
        assertNotEquals("onetwo", replaceWithLambdas.processFile_sample2Old());
    }

    @Test
    public void testProcessFile_forFirstLine() throws IOException{
        assertEquals("one", replaceWithLambdas.processFile(BufferedReader::readLine));
    }

    @Test
    public void testProcessFile_concatFirstTwoLines() throws IOException{
        assertEquals("onetwo", replaceWithLambdas.processFile((BufferedReader br)->br.readLine().concat(br.readLine())));
    }

    @Test
    public void testProcessFile_filterValueThree() throws IOException{
        assertEquals("[three]", replaceWithLambdas.processFile(
                (BufferedReader br)->br.lines().filter("three"::equals).collect(Collectors.toList()).toString()));
    }

    @Test
    public void testProcessFile_filterValueFour() throws IOException {
        assertEquals("[four]", replaceWithLambdas.processFileWithDefaultFunctionalInterface(
                (BufferedReader br)->br.lines().filter("four"::equals).collect(Collectors.toList()).toString()));
    }

}
