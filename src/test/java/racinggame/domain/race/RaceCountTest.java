package racinggame.domain.race;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RaceCountTest {
    @ParameterizedTest
    @ValueSource(strings = {"", "0", "abc"})
    void 반복횟수_생성_예외처리(String count) {
        assertThatThrownBy(() -> {
            new RaceCount(count);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("시도할 횟수는 양의 정수 값이어야 합니다.");
    }

    @Test
    void 반복횟수_생성_성공() {
        RaceCount countInt = new RaceCount(5);
        RaceCount countString = new RaceCount("5");

        assertThat(5).isEqualTo(countInt.getCount());
        assertThat(5).isEqualTo(countString.getCount());
    }
}