package racinggame.utils;

public class ValidationUtils {
    public static boolean inValid(Integer target, int min, int max) {
        return (inValidMin(target, min) && inValidMax(target, max));
    }

    public static boolean inValidMin(Integer target, int min) {
        return target >= min;
    }

    public static boolean inValidMax(Integer target, int max) {
        return target <= max;
    }

    public static boolean isEmpty(String target) {
        return (target == null || target.length() == 0);
    }

    public static boolean isNumeric(String target) {
        try {
            Integer.parseInt(target);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
