package racinggame.domain.car;

import racinggame.domain.race.RaceNumber;

public class Car {
    private CarName carName;
    private CarPosition carPosition;

    public Car(CarName name) {
        this.carName = name;
        carPosition = new CarPosition();
    }

    public void moveForward(RaceNumber raceNumber) {
        if (raceNumber.isPossibleMoveForward()) {
            carPosition.moveForward();
        }
    }

    public CarName getCarName() {
        return carName;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }
}
