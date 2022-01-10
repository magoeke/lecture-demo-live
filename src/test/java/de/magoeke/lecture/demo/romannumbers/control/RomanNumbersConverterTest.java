package de.magoeke.lecture.demo.romannumbers.control;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RomanNumbersConverterTest {

    private RomanNumbersConverter romanNumbersConverter;

    @BeforeEach
    void setUp() {
        romanNumbersConverter = new RomanNumbersConverter();
    }

    @Test
    void should_return_NAN_when_number_is_0() {
        final var result = romanNumbersConverter.convert(0);

        assertThat(result).isEqualTo("NAN");
    }

    @Test
    void should_return_NAN_when_number_is_4000() {
        final var result = romanNumbersConverter.convert(4000);

        assertThat(result).isEqualTo("NAN");
    }

    @Test
    void should_return_I_when_number_is_1() {
        final var result = romanNumbersConverter.convert(1);

        assertThat(result).isEqualTo("I");
    }

    @Test
    void should_return_II_when_number_is_2() {
        final var result = romanNumbersConverter.convert(2);

        assertThat(result).isEqualTo("II");
    }

    @Test
    void should_return_XIV_when_number_is_14() {
        final var result = romanNumbersConverter.convert(14);

        assertThat(result).isEqualTo("XIV");
    }

}
