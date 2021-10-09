package racinggame.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {
    @ParameterizedTest
    @ValueSource(strings = {"", "hongseok"})
    void 자동차이름_생성_예외처리(String name) {
        assertThatThrownBy(() -> {
            new CarName(name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 5자 이하의 값이어야 합니다.");
    }

    @Test
    void 자동차이름_생성_성공() {
        CarName name = new CarName("pobi");
        assertThat("pobi").isEqualTo(name.getName());
    }
}