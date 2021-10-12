package racinggame.view;

public class RacingGameView {
    private static final String CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String RESULT_MESSAGE = "\n실행결과";
    private static final String ERROR_MESSAGE = "[ERROR] ";
    private static final String ERROR_CAR_NAMES_MESSAGE = "5자 이하의 자동차 이름을 입력하세요.";
    private static final String ERROR_NUMBER_OF_CARS_MESSAGE = "2대 이상의 자동차를 입력하세요.";
    private static final String ERROR_RACE_COUNT_MESSAGE = "1 이상의 숫자를 입력하세요.";

    private static String winnersMessage = "최종 우승자는 {} 입니다.";

    public static void errorCarNameMessage() {
        println(makeErrorMessage(ERROR_CAR_NAMES_MESSAGE));
    }

    public static void errorNumberOfCarsMessage() {
        println(makeErrorMessage(ERROR_NUMBER_OF_CARS_MESSAGE));
    }

    public static void errorRaceCountMessage() {
        println(makeErrorMessage(ERROR_RACE_COUNT_MESSAGE));
    }

    private static String makeErrorMessage(String message) {
        StringBuilder builder = new StringBuilder();
        builder.append(ERROR_MESSAGE);
        builder.append(message);
        return builder.toString();
    }

    public static void winnersMessage(String winners) {
        println(winnersMessage.replace("{}", winners));
    }

    public static void carNamesMessage() {
        println(CAR_NAMES_MESSAGE);
    }

    public static void raceCountMessage() {
        println(COUNT_MESSAGE);
    }

    public static void resultMessage() {
        println(RESULT_MESSAGE);
    }

    public static void println(String message) {
        System.out.println(message);
    }
}
