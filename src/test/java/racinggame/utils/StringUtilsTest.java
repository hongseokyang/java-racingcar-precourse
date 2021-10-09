package racinggame.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {
    @ParameterizedTest
    @ValueSource(strings = {" pobi", "pobi ", " pobi "})
    void 좌우_공백_제거(String name) {
        assertThat("pobi").isEqualTo(StringUtils.trim(name));
    }

    @Test
    void 공백제거_빈문자열() {
        assertThat("").isEqualTo(StringUtils.trim(""));
    }

    @Test
    void 공백제거_null() {
        assertThat("").isEqualTo(StringUtils.trim(null));
    }
}