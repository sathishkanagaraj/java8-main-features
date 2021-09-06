package com.example.demo.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.function.Function;

/**
 * Created by sk on 05/09/21.
 */
public class ReplaceWithLambdas {

       /**
     * Read the first line in the file.
     * @return first line in the file
     * @throws IOException
     */
    public String processFile_sample2Old() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(Paths.get("src","main","resources","testFile.txt").toString()))) {
            return bufferedReader.readLine();
        }
    }

    /**
     * Adding behaviour parameterization by adding bufferReader as param - step1
     * In order to do step1 , define a functional interface - step2
     */
    public String processFile(BufferReaderProcessor brp) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(Paths.get("src","main","resources","testFile.txt").toString()))) {
            return brp.process(bufferedReader);
        }
    }

    /**
     * The above interface BufferReaderProcessor is not necessary
     * when there is already available Functional Interface in Java8 itself.
     */
    public String processFileWithDefaultFunctionalInterface(Function<BufferedReader, String> functionalInterface) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(Paths.get("src","main","resources","testFile.txt").toString()))) {
            return functionalInterface.apply(bufferedReader);
        }
    }

}


