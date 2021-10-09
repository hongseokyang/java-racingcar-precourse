package racinggame.domain;

import racinggame.utils.ValidationUtils;

public class CarName {
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 5;

    private String name;

    public CarName(String name) {
        if (!isValid(name)) {
            throw new IllegalArgumentException("이름은 5자 이하의 값이어야 합니다.");
        }
        this.name = name;
    }

    private boolean isValid(String name) {
        return !ValidationUtils.isEmpty(name)
                && ValidationUtils.inValid(name.length(), MIN_LENGTH, MAX_LENGTH);
    }

    public String getName() {
        return name;
    }
}
