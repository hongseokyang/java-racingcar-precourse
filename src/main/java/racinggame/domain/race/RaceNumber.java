package racinggame.domain.race;

public class RaceNumber {
    public static final int MIN_NO = 0;
    public static final int MAX_NO = 9;
    public static final int BOUNDARY_NO = 4;

    private int raceNumber;

    public RaceNumber(int raceNumber) {
        if(!inValid(raceNumber)) {
            throw new IllegalArgumentException("게임 숫자는 0~9의 값이어야 합니다.");
        }
        this.raceNumber = raceNumber;
    }

    public boolean inValid(int randomNumber) {
        return randomNumber >= MIN_NO && randomNumber <= MAX_NO;
    }

    public boolean isPossibleMoveForward() {
        return this.raceNumber >= BOUNDARY_NO;
    }
}
