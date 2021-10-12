package racinggame.domain.race;

import racinggame.domain.car.Car;
import racinggame.view.RacingGameView;

public class RaceDrawMachine {
    public static final String POSITION_CHARACTER = "-";

    public static void drawRacePosition(Car car) {
        StringBuilder builder = new StringBuilder();
        builder.append(car.getCarName().getName());
        builder.append(" : ");
        for (int i = 0; i < car.getCarPosition().getPosition(); i++) {
            builder.append(POSITION_CHARACTER);
        }
        RacingGameView.println(builder.toString());
    }
}
