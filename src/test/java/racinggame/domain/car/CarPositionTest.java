package racinggame.domain.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarPositionTest {
    CarPosition carPosition;

    @BeforeEach
    void setUp() {
        carPosition = new CarPosition(5);
    }

    @ParameterizedTest
    @CsvSource(value = {"4:-1",
            "5:0",
            "6:1"
    }, delimiter = ':')
    void 자동차_포지션_비교(int position, int expected) {
        CarPosition target = new CarPosition(position);

        assertThat(expected).isEqualTo(target.compareTo(carPosition));
    }
}