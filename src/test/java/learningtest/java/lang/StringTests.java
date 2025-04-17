package learningtest.java.lang;

import org.junit.jupiter.api.Test;

import java.util.IllegalFormatConversionException;

import static org.assertj.core.api.Assertions.assertThatException;

/**
 * Tests for {@link String}.
 *
 * @author Johnny Lim
 */
class StringTests {

    @Test
    void format() {
        assertThatException().isThrownBy(() -> String.format("%d", 1d))
                .isExactlyInstanceOf(IllegalFormatConversionException.class);
    }

}
