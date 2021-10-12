package racinggame.controller;

import nextstep.utils.Console;
import racinggame.domain.car.Car;
import racinggame.domain.car.CarName;
import racinggame.domain.car.Cars;
import racinggame.domain.race.RaceCount;
import racinggame.utils.StringUtils;
import racinggame.view.RacingGameView;

public class RacingGameSetUpController {
    public static Cars setUpCars() {
        RacingGameView.carNamesMessage();
        Cars cars = null;
        try {
            cars = createCars();
        } catch (IllegalArgumentException e) {
            RacingGameView.errorCarNameMessage();
            return null;
        }
        return isValidNumberOfCars(cars) ? cars : null;
    }

    private static Cars createCars() {
        String[] carNames = splitCarNames();
        Cars cars = new Cars();

        for (int i = 0; i < carNames.length; i++) {
            cars.addCar(setUpCar(StringUtils.trim(carNames[i])));
        }
        return cars;
    }

    private static String[] splitCarNames() {
        return Console.readLine().split(",");
    }

    private static boolean isValidNumberOfCars(Cars cars) {
        if (cars.getCars().size() < 2) {
            RacingGameView.errorNumberOfCarsMessage();
            return false;
        }
        return true;
    }

    private static Car setUpCar(String name) {
        return new Car(setUpCarName(name));
    }

    private static CarName setUpCarName(String name) {
        return new CarName(name);
    }

    public static RaceCount setUpRaceCount() {
        RaceCount raceCount = null;
        RacingGameView.raceCountMessage();
        try {
            raceCount = new RaceCount(Console.readLine());
        } catch (IllegalArgumentException e) {
            RacingGameView.errorRaceCountMessage();
        }
        return raceCount;
    }
}
