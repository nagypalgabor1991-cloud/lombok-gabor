public class RegexValidators {

    public static boolean isValidEan13(String input) {
        if (input == null) {
            return false;
        }
        return input.matches("^\\d{13}$");
    }

    public static boolean isValidItalianMobileNumber(String input) {
        if (input == null) {
            return false;
        }
        return input.matches("^\\+393\\d{8,9}$");
    }

    public static boolean isHelloOrWorld(String input) {
        if (input == null) {
            return false;
        }
        return input.matches("(?i)^(hello|world)$");
    }

    public static boolean isSpecialCode(String input) {
        if (input == null) {
            return false;
        }
        return input.matches("^[^\\d]{3}[A-Z]{2}[a-zA-Z]{2}\\d[1-5].{5}\\.$");
    }
}
