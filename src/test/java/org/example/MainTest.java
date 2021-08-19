package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sayHallo() {
        Main app = new Main();
        assertEquals("Hallo Welt!", app.sayHallo());
    }
}