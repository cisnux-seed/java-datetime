package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ZonedDateTimeTest {
    @Test
    void create() {
        final var zonedDateTime1 = ZonedDateTime.now();
        final var zonedDateTime2 = ZonedDateTime.of(
                LocalDateTime.of(2020, Month.APRIL, 12, 20, 30, 30),
                ZoneId.of("Asia/Jakarta")
        );
        final var zonedDateTime3 = ZonedDateTime.now(ZoneId.of("GMT"));
        final var zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(5));
        final var zonedDateTime5 = ZonedDateTime.now(ZoneId.of("Asia/Singapore"));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime5);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);
    }

    @Test
    void parsing() {
        final var zonedDateTime1 = ZonedDateTime.parse("1980-10-10T10:10:10+07:00[Asia/Jakarta]");
        final var zonedDateTime2 = ZonedDateTime.parse("1980-10-10T10:10:10+05:00");

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }

    @Test
    void changeZoneId() {
        final var zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        final var zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));
        final var zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
