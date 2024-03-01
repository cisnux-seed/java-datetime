package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void create() {
        final var dayOfWeek1 = DayOfWeek.SUNDAY;
        final var dayOfWeek2 = dayOfWeek1.plus(7);
        final var dayOfWeek3 = dayOfWeek1.plus(1);

        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3);
    }
}
