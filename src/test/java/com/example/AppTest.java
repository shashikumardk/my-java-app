package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {

        int result = App.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void testMain() {

        PrintStream originalOut = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));

        App.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("Hello from Jenkins CI!\n", output.toString());
    }

    @Test
    void testAppConstructor() {

        App app = new App();

        assertEquals(App.class, app.getClass());
    } 
}
