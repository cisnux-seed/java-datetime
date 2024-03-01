package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void create() {
        final var localDate1 = LocalDate.now();
        final var localDate2 = LocalDate.of(1960, Month.JANUARY, 10);
        final var localDate3 = LocalDate.parse("1980-01-10");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void with() {
        final var localDate1 = LocalDate.now();
        final var localDate2 = localDate1.withYear(1960);
        final var localDate3 = localDate1.withYear(1980).withMonth(1);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void modify() {
        final var localDate1 = LocalDate.now();
        final var localDate2 = localDate1.plusYears(10);
        final var localDate3 = localDate1.minusMonths(10);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void get() {
        final var localDate1 = LocalDate.now();

        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getMonthValue());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfYear());
    }
}
