package racinggame.domain.race;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racinggame.domain.car.Car;
import racinggame.domain.car.CarName;
import racinggame.domain.car.Cars;

import static org.assertj.core.api.Assertions.assertThat;

class RaceWinnersTest {
    Car car1;
    Car car2;
    Car car3;
    Cars cars;

    @BeforeEach
    void setUp() {
        car1 = new Car(new CarName("car1"));
        car2 = new Car(new CarName("car2"));
        car3 = new Car(new CarName("car3"));

        cars = new Cars();
        cars.addCar(car1);
        cars.addCar(car2);
        cars.addCar(car3);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1:1:car1,car2,car3",
            "1:2:2:car2,car3",
            "1:2:3:car3"
    }, delimiter = ':')
    void 우승자_확인(int position1, int position2, int position3, String winner) {
        play(position1, position2, position3);
        assertThat(winner).isEqualTo(new RaceWinners().raceScoring(cars).getNames());
    }

    private void play(int position1, int position2, int position3) {
        moveForward(car1, position1);
        moveForward(car2, position2);
        moveForward(car3, position3);
    }

    void moveForward(Car car, int moveCount) {
        for (int i = 0; i <moveCount; i++) {
            car.moveForward(new RaceNumber(RaceNumber.BOUNDARY_NO));
        }
    }
}