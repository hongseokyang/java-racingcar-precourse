package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingGameRandomNumberTest {
    @Test
    @DisplayName("범위보다 낮은 숫자로 볼 생성하기")
    public void 랜덤숫자_생성_실패() {
        assertThatThrownBy(() -> {
            new RandomRaceNumber(10);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("랜덤 숫자는 0~9의 값이어야 합니다.");
    }

    @ParameterizedTest
    @CsvSource(value = {"0:false",
            "9:true",
            "3:false",
            "4:true",
    }, delimiter = ':')
    void 앞으로_전진(int randomNumber, boolean expected) {
        assertThat(expected).isEqualTo(new RandomRaceNumber(randomNumber).isPossibleMoveForward());
    }
}