package racinggame.domain.car;

import java.util.ArrayList;
import java.util.List;

public class CarNames {
    private List<CarName> carNames;

    public CarNames() {
        this.carNames = new ArrayList<>();
    }

    public void addCarName(CarName carName) {
        carNames.add(carName);
    }

    public List<CarName> getCarNames() {
        return carNames;
    }
}
