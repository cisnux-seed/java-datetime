package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {
    @Test
    void create() {
        final var clock1 = Clock.systemUTC();
        System.out.println(clock1);

        final var clock2 = Clock.systemDefaultZone();
        System.out.println(clock2);

        final var clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock3);
    }

    @Test
    void instant() throws InterruptedException {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        final var instant1 = clock.instant();
        System.out.println(instant1);

        Thread.sleep(1_000);

        final var instant2 = clock.instant();
        System.out.println(instant2);
    }

    @Test
    void fromClock() {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        final var year = Year.now(clock);
        System.out.println(year);

        final var yearMonth = YearMonth.now(clock);
        final var monthDay = MonthDay.now(clock);
        final var localTime = LocalTime.now(clock);
        final var localDateTime = LocalDateTime.now(clock);
        final var offsetTime = OffsetTime.now(clock);
        final var offsetDateTime = OffsetDateTime.now(clock);
        final var zonedDateTime = ZonedDateTime.now(clock);

        System.out.println(yearMonth);
        System.out.println(monthDay);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        System.out.println(offsetDateTime);
        System.out.println(offsetTime);
    }
}
