package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;

public class LocalTimeTest {
    @Test
    void create() {
        final var localTime1 = LocalTime.now();
        final var localTime2 = LocalTime.of(10, 10, 10);
        final var localTime3 = LocalTime.parse("08:08");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void with() {
        final var localTime1 = LocalTime.now();
        final var localTime2 = localTime1.withHour(10);
        final var localTime3 = localTime1.withHour(5).withMinute(10).withSecond(0);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void modify() {
        final var localTime1 = LocalTime.now();
        final var localTime2 = localTime1.plusHours(10);
        final var localTime3 = localTime1.plusHours(5).minusMinutes(10).minusSeconds(5);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void get() {
        final var localTime = LocalTime.now();

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
    }
}
