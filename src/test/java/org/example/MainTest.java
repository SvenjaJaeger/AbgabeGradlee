package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.extension.TestWatcher;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @RegisterExtension
    static TestWatcher watcher = new LoggingExtension(MainTest.class);

    @ParameterizedTest
    @ValueSource(strings = {"Para 1", "Para 2", "Para 3"})
    public void evalStrings (String wert){
        assertTrue(wert.contains("Para"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  ","\t", "\n"})
    void isBlank(String s){
        assertTrue(Main.isBlank(s));
    }

    @Test
    void alleZusammen(){
        assertAll("Name",
                () -> assertTrue(1>2),
                () -> assertEquals(4,4)
        );
    }

    @Test
    void  aussnahme(){
        assertThrows(Exception.class, () -> {
            throw new Exception();
        });
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void TimeOut1(){
        try{
            int sum = 0;
            for (int i = 0; i < 10 ; i++) {
                Thread.sleep(100);;
                sum +=1;
            }
            assertTrue(sum > 0);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }




}
