package com.techreturners.exercise004;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class Exercise004Test {


    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithMillenniumRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(1999, Month.DECEMBER, 31, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2031, Month.SEPTEMBER, 9, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedAndYearIsZero() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(0, Month.JANUARY, 1, 0, 0, 0, 0));
        LocalDateTime expected = LocalDateTime.of(31, Month.SEPTEMBER, 9, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenMinDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(-999999999, Month.JANUARY, 1, 0, 0, 0, 0));
        LocalDateTime expected = LocalDateTime.of(-999999968, Month.SEPTEMBER, 9, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenMaxDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(999999968, Month.APRIL, 23, 22, 13, 19, 0));
        LocalDateTime expected = LocalDateTime.of(999999999, Month.DECEMBER, 31, 23, 59, 59);

        assertEquals(expected, ex004.getDateTime());
    }

}
