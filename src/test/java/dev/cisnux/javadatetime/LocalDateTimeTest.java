package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest {
    @Test
    void create() {
        final var localDateTime1 = LocalDateTime.now();
        final var localDateTime2 = LocalDateTime.of(1980, Month.JANUARY, 8, 10, 9, 10,456000000);
        final var localDateTime3 = LocalDateTime.parse("1980-01-08T10:09:10.456");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void with() {
        final var localDateTime1 = LocalDateTime.now();
        final var localDateTime2 = localDateTime1.withYear(1980).withMonth(1);
        final var localDateTime3 = localDateTime1.withYear(1988).withHour(9);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void modify() {
        final var localDateTime1 = LocalDateTime.now();
        final var localDateTime2 = localDateTime1.plusYears(5).minusHours(5);
        final var localDateTime3 = localDateTime1.minusYears(5).plusHours(5);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void get() {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
    }

    @Test
    void date() {
        final var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        final var localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        final var result = localDate.atTime(10, 10, 10, 10);
        System.out.println(result);
    }

    @Test
    void time() {
        final var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        final var localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime result = localTime.atDate(LocalDate.of(2000, 10, 10));
        System.out.println(result);
    }
}
