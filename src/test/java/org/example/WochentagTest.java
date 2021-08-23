package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WochentagTest {

    @ParameterizedTest
    @EnumSource(Wochentag.class)
    void getNummer(Wochentag tag) {
        int n = tag.getNummer();
        assertTrue(1 <= n && n <= 7);
    }

    //Test für das Wochenden
    @ParameterizedTest
    @EnumSource(value = Wochentag.class, names = {"SAMSTAG", "SONNTAG"})
    void wochenendeTest(Wochentag tag) {
        int n = tag.getNummer();
        assertTrue(n == 6 || n == 7);
    }

    @ParameterizedTest
    @CsvSource({"SAMSTAG,6", "SONNTAG, 7"})
    void wochenendeCsvTest(Wochentag tag, int expected){
        int n = tag.getNummer();
        assertEquals(expected, n);
    }

    @ParameterizedTest
    @MethodSource("provideWochentage")
    void istWochenende(Wochentag tag, boolean expected){
        boolean result = tag == Wochentag.SAMSTAG || tag == Wochentag.SONNTAG;
        assertEquals(expected, result);
    }

    public static List<Arguments> provideWochentag(){
        return List.of(
                Arguments.of(Wochentag.MONTAG, false),
                Arguments.of(Wochentag.DIENSTAG, false),
                Arguments.of(Wochentag.MITTWOCH, false),
                Arguments.of(Wochentag.DONNERSTAG, false),
                Arguments.of(Wochentag.FREITAG, false),
                Arguments.of(Wochentag.SAMSTAG, false),
                Arguments.of(Wochentag.SONNTAG, false)
        );
    }

    public static Stream<Arguments> provideWochentagStream(){
        return Stream.of(
                Arguments.of(Wochentag.MONTAG, false),
                Arguments.of(Wochentag.DIENSTAG, false),
                Arguments.of(Wochentag.MITTWOCH, false),
                Arguments.of(Wochentag.DONNERSTAG, false),
                Arguments.of(Wochentag.FREITAG, false),
                Arguments.of(Wochentag.SAMSTAG, false),
                Arguments.of(Wochentag.SONNTAG, false)
        );
    }
}