package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {

    @Test
    void fromLegacy() {
        final var date = new Date();
        System.out.println(date);
        final var instant = date.toInstant();
        System.out.println(instant);

        final var calendar = Calendar.getInstance();
        System.out.println(calendar);
        final var instant1 = calendar.toInstant();
        System.out.println(instant1);

        final var timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        final var zoneId = timeZone.toZoneId();
        System.out.println(zoneId);
    }

    @Test
    void toLegacy() {
        final var zonedDateTime = ZonedDateTime.now();

        Date date = Date.from(zonedDateTime.toInstant());
        System.out.println(date);

        Calendar calendar = GregorianCalendar.from(zonedDateTime);
        System.out.println(calendar);

        final var zoneId = ZoneId.systemDefault();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println(timeZone);
    }
}
