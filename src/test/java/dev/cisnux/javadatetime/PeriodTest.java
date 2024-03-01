package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {

    @Test
    void create() {
        final var period1 = Period.ofDays(10);
        final var period2 = Period.ofWeeks(10);
        final var period3 = Period.ofMonths(10);
        final var period4 = Period.ofYears(10);
        final var period5 = Period.of(10, 10, 10);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void get() {
        final var period = Period.of(10, 10, 10);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    @Test
    void between() {
        final var period = Period.between(
                LocalDate.of(2002, Month.JUNE, 12),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
