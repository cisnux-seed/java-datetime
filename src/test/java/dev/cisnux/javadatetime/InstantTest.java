package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {
    @Test
    void create() {
        final var instant1 = Instant.now();
        System.out.println(instant1);

        final var instant2 = Instant.ofEpochMilli(-1);
        System.out.println(instant2);

        final var instant3 = LocalDateTime.of(1950, Month.JULY, 12, 20, 20, 20).toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant3);
        System.out.println(instant3.toEpochMilli());
        System.out.println(Instant.ofEpochMilli(instant3.toEpochMilli()));
    }

    @Test
    void modify() {
        final var instant1 = Instant.now();
        final var instant2 = instant1.plusMillis(1000);
        final var instant3 = instant1.minusMillis(1000);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
    }

    @Test
    void get() {
        final var instant = Instant.now();
        final var instant4 = LocalDateTime.of(1960, Month.JULY, 12, 20, 20, 20).toInstant(ZoneOffset.ofHours(7));

        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(instant4.toEpochMilli());
    }

    @Test
    void fromInstant() {
        final var instant = Instant.now();
        final var zoneId = ZoneId.of("Asia/Singapore");

        final var localTime = LocalTime.ofInstant(instant, zoneId);
        System.out.println(localTime);

        final var localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);

        final var zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);

        final var offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);
        System.out.println(offsetDateTime);
    }

    @Test
    void toInstant() {
        final var instant1 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant1);

        final var instant2 = ZonedDateTime.now().toInstant();
        System.out.println(instant2);

        final var instant3 = OffsetDateTime.now().toInstant();
        System.out.println(instant3);

        final var instant4 = LocalDateTime.of(1960, Month.JULY, 12, 20, 20, 20).toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant4);
    }
}
