package racinggame.domain.car;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarNamesTest {
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "hong"})
    void 자동차이름_추가(String name) {
        CarNames names = new CarNames();
        names.addCarName(new CarName(name));
        assertThat(name).isEqualTo(names.getCarNames().get(0).getName());
    }
}