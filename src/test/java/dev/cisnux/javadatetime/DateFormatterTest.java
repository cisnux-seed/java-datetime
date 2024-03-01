package dev.cisnux.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {
    @Test
    void parsing() {
        final var formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        final var localDate = LocalDate.parse("2020 10 25", formatter);
        System.out.println(localDate);

    }

    @Test
    void format() {
        final var formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        final var localDate = LocalDate.parse("2020 10 25", formatter);
        String format = localDate.format(formatter);

        System.out.println(format);
    }

    @Test
    void defaultFormatter() {
        final var formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        final var localDate = LocalDate.parse("2020 10 25", formatter);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format);
    }

    @Test
    void i18n() {
        final var locale = Locale.of("id", "ID");
        final var formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.of(2020, Month.MARCH, 1);
        String format = localDate.format(formatter);

        System.out.println(format);
    }
}
