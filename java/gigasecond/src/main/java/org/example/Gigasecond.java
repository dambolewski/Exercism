package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    public static void main(String[] args) {
    }

    public static LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        Gigasecond.moment = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        Gigasecond.moment = moment;
    }

    public static LocalDateTime getDateTime() {
        long secs = 1_000_000_000L;
        if(moment != null){
            return moment.plusSeconds(secs);
        }
        return null;
    }
}