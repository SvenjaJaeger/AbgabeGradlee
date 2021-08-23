package org.example;

public enum Wochentag {
    MONTAG(1), DIENSTAG(2), MITTWOCH(3), DONNERSTAG(4), FREITAG(5), SAMSTAG(6), SONNTAG(7);

    private final int nummer;

    private Wochentag(int n) {
        nummer = n;
    }

    public int getNummer(){
        return nummer;
    }
}
