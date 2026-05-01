public class StringSmallExercises {
    public static void main(String[] args) {
        System.out.println(countOccurrenceOfB("bBffFDGddbB"));
        System.out.println(countOccurrenceOfHello("helloabcdhelloasvbhellogdvmhello"));
    }

    public static int countOccurrenceOfB(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B') {
                count++;
            }
        }
        return count;
    }

    public static int countOccurrenceOfHello(String str) {
        int count = 0;
        String lookingFor = "hello";
        for (int i = 0; i <= str.length() - lookingFor.length(); i++) {
            if (str.substring(i, i + lookingFor.length()).equals(lookingFor)) {
                count++;
            }
        }
        return count;
    }
}