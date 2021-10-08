package racinggame.domain;

public class RacingGameRandomNumber {
    public static final int MIN_NO = 0;
    public static final int MAX_NO = 9;
    public static final int BOUNDARY_NO = 4;

    private int randomNumber;

    public RacingGameRandomNumber(int randomNumber) {
        if(!inValid(randomNumber)) {
            throw new IllegalArgumentException("랜덤 숫자는 0~9의 값이어야 합니다.");
        }
        this.randomNumber = randomNumber;
    }

    public boolean inValid(int randomNumber) {
        return randomNumber >= MIN_NO && randomNumber <= MAX_NO;
    }

    public boolean isPossibleMoveForward() {
        return this.randomNumber >= BOUNDARY_NO;
    }
}
