package racinggame.domain.race;

import racinggame.domain.car.*;
import java.util.ArrayList;
import java.util.List;

public class RaceWinners {
    private Cars winners;
    private CarPosition winnerPosition;

    public RaceWinners raceScoring(Cars cars) {
        winners = new Cars();
        winnerPosition = new CarPosition();
        for (Car car : cars.getCars()) {
            compare(winnerPosition, car);
        }
        return this;
    }

    private void compare(CarPosition biggestPosition, Car targetCar) {
        CarPosition targetPosition = targetCar.getCarPosition();
        if (isDraw(targetPosition, biggestPosition)) {
            winners.addCar(targetCar);
        }

        if (isWin(targetPosition, biggestPosition)) {
            addWinner(targetCar);
            winnerPosition = targetCar.getCarPosition();
        }
    }

    private void addWinner(Car winner) {
        winners = new Cars();
        winners.addCar(winner);
    }

    private boolean isDraw(CarPosition targetPosition, CarPosition biggestPosition) {
        return targetPosition.compareTo(biggestPosition) == 0;
    }

    private boolean isWin(CarPosition targetPosition, CarPosition biggestPosition) {
        return targetPosition.compareTo(biggestPosition) == 1;
    }

    public String getNames() {
        List<String> winnerNames = new ArrayList<>();
        for (CarName name : winners.getNames().getCarNames()) {
            winnerNames.add(name.getName());
        }
        return String.join(",", winnerNames);
    }
}
