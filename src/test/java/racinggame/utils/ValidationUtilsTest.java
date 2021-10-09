package racinggame.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidationUtilsTest {
    final int MIN_LENGTH = 0;
    final int MAX_LENGTH = 5;

    @Test
    void 자동차이름_검증() {
        assertThat(ValidationUtils.inValid("hongseok".length(), MIN_LENGTH, MAX_LENGTH)).isFalse();
        assertThat(ValidationUtils.inValid("pobi".length(), MIN_LENGTH, MAX_LENGTH)).isTrue();
    }

    @Test
    void 반복횟수_범위_검증() {
        assertThat(ValidationUtils.inValidMin(0, 1)).isFalse();
        assertThat(ValidationUtils.inValidMin(1, 1)).isTrue();
        assertThat(ValidationUtils.inValidMin(11, 1)).isTrue();
    }

    @Test
    void 반복횟수_EMPTY_검증() {
        assertThat(ValidationUtils.isEmpty("")).isTrue();
        assertThat(ValidationUtils.isEmpty(null)).isTrue();
        assertThat(ValidationUtils.isEmpty("10")).isFalse();
    }

    @Test
    void 반복횟수_숫자인지_검증() {
        assertThat(ValidationUtils.isNumeric("abc")).isFalse();
        assertThat(ValidationUtils.isNumeric("!@#")).isFalse();
        assertThat(ValidationUtils.isNumeric("123")).isTrue();
    }

    @Test
    void 랜덤_게임숫자_검증() {
        assertThat(ValidationUtils.inValid(-1, 0, 9)).isFalse();
        assertThat(ValidationUtils.inValid(10, 0, 9)).isFalse();
        assertThat(ValidationUtils.inValid(0, 0, 9)).isTrue();
        assertThat(ValidationUtils.inValid(9, 0, 9)).isTrue();
    }
}
