package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZoneTest {
    @Test
    void createZoneId() {
        final var zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        final var zoneIdGMT = ZoneId.of("GMT");
        System.out.println(zoneIdGMT);

        final var availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
    }

    @Test
    void createOffsetZone() {
        final var zoneOffset1 = ZoneOffset.of("+07:00");
        final var zoneOffset2 = ZoneOffset.ofHours(-7);
        final var zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}
