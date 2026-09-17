public class Validators {

    public static void main(String[] args) {

    }

    public static boolean isValidEan13(String input) {
        if (input == null || input.length() != 13) {
            return false;
        }
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidItalianMobileNumber(String input) {
        if (input == null || !input.startsWith("+393")) {
            return false;
        }
        if (input.length() - 3 != 9 && input.length() - 3 != 10) {
            return false;
        }
        for (int i = 4; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHelloOrWorld(String input) {
        if (input == null) {
            return false;
        }
        return input.equalsIgnoreCase("hello") || input.equalsIgnoreCase("world");
    }

    public static boolean isSpecialCode(String input) {
        if (input == null || input.length() != 15) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            if (Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        for (int i = 3; i < 5; i++) {
            if (!Character.isUpperCase(input.charAt(i))) {
                return false;
            }
        }

        for (int i = 5; i < 7; i++) {
            if (!Character.isLetter(input.charAt(i))) {
                return false;
            }
        }

        if (!Character.isDigit(input.charAt(7))) {
            return false;
        }

        char c = input.charAt(8);
        if (c < '1' || c > '5') {
            return false;
        }

        return input.charAt(14) == '.';
    }
}
