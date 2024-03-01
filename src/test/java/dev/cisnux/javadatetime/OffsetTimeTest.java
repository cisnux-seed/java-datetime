package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {
    @Test
    void create() {
        final var offsetTime1 = OffsetTime.now();
        final var offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Singapore"));
        final var offsetTime3 = OffsetTime.of(10, 10, 10, 10, ZoneOffset.ofHours(7));
        final var offsetTime4 = OffsetTime.parse("09:09:09.100+07:00");

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);
        System.out.println(offsetTime4);

        final var offsetDateTime1 = OffsetDateTime.now();
        final var offsetDateTime2 = OffsetDateTime.now(ZoneId.of("Asia/Singapore"));
        final var offsetDateTime3 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(8));
        final var offsetDateTime4 = OffsetDateTime.parse("1980-09-17T10:10:10.100+05:00");

        System.out.println();
        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
        System.out.println(offsetDateTime4);
    }

    @Test
    void toLocalTime() {
        System.out.println();
        final var localTime = LocalTime.now();
        System.out.println(localTime);

        final var offsetTime = localTime.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetTime);

        final var localTime1 = offsetTime.toLocalTime();
        System.out.println(localTime1);
    }

    @Test
    void toLocalDateTime() {
        System.out.println();
        final var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        final var offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime);

        final var localDateTime1 = offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);
    }
}
