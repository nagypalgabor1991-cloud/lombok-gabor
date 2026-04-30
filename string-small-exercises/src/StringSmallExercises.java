public class StringSmallExercises {
    public static void main(String[] args) {
        System.out.println(countOccurrenceOfB("bBffFDGddbB"));
        System.out.println(countOccurrenceOfHello("helloabcdhelloasvbhellogdvmhello"));
    }

    public static int countOccurrenceOfB(String str) {
        int count = 0;
        for (char i : str.toCharArray()) {
            if (i == 'B') {
                count++;
            }
        }
        return count;
    }

    public static int countOccurrenceOfHello(String str) {
        int count = 0;
        while (str != null && str.length() >= 5) {
            if (str.charAt(0) == 'h') {
                if (str.charAt(1) == 'e') {
                    if (str.charAt(2) == 'l') {
                        if (str.charAt(3) == 'l') {
                            if (str.charAt(4) == 'o') {
                                count++;
                            }
                        }
                    }
                }
            }
            str = str.substring(1);
        }
        return count;
    }
}