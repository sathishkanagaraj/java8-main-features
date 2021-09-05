package com.example.demo.lambda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by sk on 05/09/21.
 */
@FunctionalInterface
public interface BufferReaderProcessor{
    String process(BufferedReader bufferedReader) throws IOException;
}
