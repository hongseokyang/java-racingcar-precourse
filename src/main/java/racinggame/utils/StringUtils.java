package racinggame.utils;

public class StringUtils {
    public static String trim(String target) {
        return rtrim(ltrim(target));
    }
    public static String rtrim(String target) {
        if(!ValidationUtils.isEmpty(target)) {
            return target.replaceAll("\\s+$","");
        }
        return "";
    }

    public static String ltrim(String target) {
        if(!ValidationUtils.isEmpty(target)) {
            return target.replaceAll("^\\s+","");
        }
        return "";
    }
}
