package racinggame.controller;

import nextstep.utils.Randoms;
import racinggame.domain.car.Car;
import racinggame.domain.car.Cars;
import racinggame.domain.race.RaceCount;
import racinggame.domain.race.RaceDrawMachine;
import racinggame.domain.race.RaceNumber;
import racinggame.domain.race.RaceWinners;
import racinggame.view.RacingGameView;

public class RacingGameController {
    private RaceCount raceCount;
    private Cars cars;

    public void start() {
        setUpRaceInfo();
        RacingGameView.resultMessage();
        for (int i = 0; i < raceCount.getCount(); i++) {
            play();
        }
        finish();
    }

    private void finish() {
        RaceWinners winners = new RaceWinners().raceScoring(cars);
        RacingGameView.winnersMessage(winners.getNames());
    }

    private void setUpRaceInfo() {
        do {
            cars = RacingGameSetUpController.setUpCars();
        } while (isFailedCarsSetUp());

        do {
            raceCount = RacingGameSetUpController.setUpRaceCount();
        } while (isFailedRaceCountSetUp());
    }

    private boolean isFailedRaceCountSetUp() {
        return raceCount == null;
    }

    private boolean isFailedCarsSetUp() {
        return (cars == null || cars.getCars().size() < 2);
    }

    public void play() {
        for (Car car: cars.getCars()) {
            car.moveForward(makeRaceNumber());
            RaceDrawMachine.drawRacePosition(car);
        }
        RacingGameView.println("");
    }

    private RaceNumber makeRaceNumber() {
        return new RaceNumber(Randoms.pickNumberInRange(RaceNumber.MIN_NO, RaceNumber.MAX_NO));
    }
}
