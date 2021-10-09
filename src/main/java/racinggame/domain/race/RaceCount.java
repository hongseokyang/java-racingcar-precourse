package racinggame.domain.race;

import racinggame.utils.ValidationUtils;

public class RaceCount {
    private static final int MIN_NO = 1;

    private int count;

    public RaceCount(String count) {
        validate(count);
        this.count = Integer.parseInt(count);
    }

    public RaceCount(int count) {
        validate(count);
        this.count = count;
    }

    private void validate(String count) {
        if (!isValid(count)) {
            illegalArgumentException();
        }
    }

    private void validate(int count) {
        if (!isValid(count)) {
            illegalArgumentException();
        }
    }

    private void illegalArgumentException() {
        throw new IllegalArgumentException("시도할 횟수는 양의 정수 값이어야 합니다.");
    }

    private boolean isValid(String count) {
        return !ValidationUtils.isEmpty(count)
                && ValidationUtils.isNumeric(count)
                && isValid(Integer.parseInt(count));
    }

    private boolean isValid(int count) {
        return ValidationUtils.inValidMin(count, MIN_NO);
    }

    public int getCount() {
        return count;
    }
}
