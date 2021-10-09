package racinggame.domain.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racinggame.domain.race.RaceNumber;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    CarName name;
    Car car;

    @BeforeEach
    void setUp() {
        name = new CarName("pobi");
        car = new Car(name);
    }

    @Test
    void 이름으로_자동차_생성() {
        assertThat("pobi").isEqualTo(car.getCarName().getName());
    }

    @ParameterizedTest
    @CsvSource(value = {"0:0",
            "3:0",
            "4:1",
            "9:1",
    }, delimiter = ':')
    void 전진_or_멈춤(int raceNumber, int expected) {
        car.moveForward(new RaceNumber(raceNumber));
        assertThat(expected).isEqualTo(car.getCarPosition().getPosition());
    }
}