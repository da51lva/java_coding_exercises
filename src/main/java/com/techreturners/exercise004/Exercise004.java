package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private static final long GIGASECOND = 1000000000;

    LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay().plusSeconds(GIGASECOND);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
