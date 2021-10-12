package racinggame.domain.car;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "hong"})
    void 자동차_추가(String name) {
        Cars cars = new Cars();
        cars.addCar(new Car(new CarName(name)));
        assertThat(name).isEqualTo(cars.getCars().get(0).getCarName().getName());
    }

}