package racinggame.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public CarNames getNames() {
        CarNames names = new CarNames();
        for (Car car : cars) {
            names.addCarName(car.getCarName());
        }
        return names;
    }
}
