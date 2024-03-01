package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {
    @Test
    void create() {
        final var timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);

        final var timeZoneGMT = TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGMT);

        final var availableIDs = TimeZone.getAvailableIDs();
        Arrays.asList(availableIDs).forEach(System.out::println);
    }

    @Test
    void date() {
        final var date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
    }

    @Test
    void calendar() {
        final var calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        final var calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));

        calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
    }
}
