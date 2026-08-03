import java.util.*;

public class AlgorithmicTasks {
    public static void main(String[] args) {
    /*
    These tasks show some typical patterns for problems that can be solved with certain types of collections. We are focusing on certain implementations of List, Set and Map.
    Questions to ask before solving each tasks
        1. Which collection is / collections are suitable to solve such a problem?
        2. What are the edge cases? Write tests for all of them!
        3. Implement and fine-tune our code

    Write a method that …
    */
    }

    /*
    1. Removes duplicates from a word.
    Example: Input: "banana" → Output: "ban"
    */
    public static String removeDuplications(String input) {
        Set<Character> characters = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            characters.add(input.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : characters) {
            sb.append(c);
        }
        return sb.toString();
    }

    /*
    2. Checks if two strings are anagrams
    Input: "listen" and "silent" → Output: true
    */
    public static boolean areAnagrams(String first, String second) {

        if (first == null || second == null) {
            return first == null && second == null;
        }

        Map<Character, Integer> firstWordFrequency = generateFrequencyMap(first);
        Map<Character, Integer> secondWordFrequency = generateFrequencyMap(second);

        return firstWordFrequency.equals(secondWordFrequency);
    }

    private static Map<Character, Integer> generateFrequencyMap(String word) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char actualCharacter = word.charAt(i);
            if (!frequency.containsKey(actualCharacter)) {
                frequency.put(actualCharacter, 1);
            } else {
                frequency.put(actualCharacter, frequency.get(actualCharacter) + 1);
            }
        }
        return frequency;
    }

    /*
    3. Gets in two lists and returns with a third one that contains the union of the two
    lists, but each element can occur only once.
    Input: [1, 2, 2, 1, 1],[1, 3, 4]  → Output: [1,2,3,4] (the order does not matter)
    */
    public static Set<Integer> getUnion(List<Integer> first, List<Integer> second) {
        Set<Integer> result = new HashSet<>();
        result.addAll(first);
        result.addAll(second);
        return result;
    }

    /*
    4. Counts the frequency of elements in a List of numbers
    Input: [1, 2, 2, 3, 1] → Output: {1=2, 2=2, 3=1}
    */
    public static Map<Integer, Integer> countFrequency(List<Integer> input) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : input) {
            if (!frequency.containsKey(value)) {
                frequency.put(value, 1);
            } else {
                frequency.put(value, frequency.get(value) + 1);
            }
        }
        return frequency;
    }

    /*
    5. Checks if a word contains only unique letters
    Input: "lamp" → true, "ball" → false
    */
    public static boolean containsOnlyUniqueLetters(String word) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char actual = word.charAt(i);
            if (!characters.add(actual)) {
                return false;
            }
        }
        return true;
    }

    /*
    6. Gets in two lists that are guaranteed to be sorted and returns with a new
    one that merges the two lists and keeps it sorted.
    Input: [1, 3, 5] and [2, 4, 6] → Output: [1, 2, 3, 4, 5, 6]
    */
    public static List<Integer> merge(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>();
        result.addAll(first);
        result.addAll(second);
        return result.stream().sorted().toList();
    }

    /*
    7. Gets in a list and returns the second largest number in that list:
    Input: [3, 1, 4, 1, 5, 9] → Output: 5
    Input: [3, 1, 4, 1, 9, 9] → Output: 9
    */
    public static int getSecondLargestNumber(List<Integer> input) {
        List<Integer> copy = new ArrayList<>(input);
        Collections.sort(copy);
        return input.get(copy.size() - 2);
    }

    /*
    8. Returns with the common elements of two lists
    Input: [1,2,3,4] and [3,4,5,6] → Output: [3,4]
    */
    public static List<Integer> getCommonElements(List<Integer> first, List<Integer> second) {
        Set<Integer> firstSet = new HashSet<>(first);
        firstSet.retainAll(second);
        return firstSet.stream().toList();
    }

    /*
    9. Gets the most frequent word from a list of words separated with spaces.
    It is guaranteed there is only one most frequent word
    Input: "Hello hello world!" → Output: hello
    */
    public static String getMostFrequentWord(String text) {
        String lowerCaseText = text.toLowerCase();
        String[] words = lowerCaseText.split(" ");
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (!frequency.containsKey(word)) {
                frequency.put(word, 1);
            } else {
                frequency.put(word, frequency.get(word) + 1);
            }
        }
        int maxFrequency = 0;
        String mostFrequentWord = "";
        for (Map.Entry<String, Integer> entrySet : frequency.entrySet()) {
            if (entrySet.getValue() > maxFrequency) {
                maxFrequency = entrySet.getValue();
                mostFrequentWord = entrySet.getKey();
            }
        }
        return mostFrequentWord;
    }

    /*
    10. Gets in a sentence and counts the distinct words in that.
    Input: "The cat and the dog."
    Output: 4  because there are 4 distinct words → ["the", "cat", "and", "dog"]
    */
    public static int countDistinctWords(String sentence) {
        String[] splitWords = sentence.split(" ");
        Set<String> words = new HashSet<>();
        for (String word : splitWords) {
            String lowerCaseWord = word.toLowerCase();
            words.add(lowerCaseWord);
        }
        return words.size();
    }

    /*
    11. Gets in a list of numbers and returns a new list with those elements that
    occur only once in the original list
    Input: [4, 5, 4, 6, 7, 6] → Output: [5, 7]
    */
    public static Set<Integer> getSingleElements(List<Integer> numbers) {
        Set<Integer> result = new HashSet<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            if (!frequency.containsKey(number)) {
                frequency.put(number, 1);
            } else {
                frequency.put(number, frequency.get(number) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entrySet : frequency.entrySet()) {
            if (entrySet.getValue() == 1) {
                result.add(entrySet.getKey());
            }
        }
        return result;
    }

    /*
    12. Gets in a string containing words separated with commas and returns
    with the most frequent starting letter among all words.
    Input: ["apple", "ant", "banana", "blue", "blues", "ceiling"]
    Output: b
    */
    public static char getMostFrequentStartingLetter(String words) {
        String[] splitWords = words.split(", ");
        Map<Character, Integer> characterFrequencies = getStartingCharaterFrequencies(splitWords);
        int occurance = 0;
        char mostFrequentChar = '\u0000';
        for (Map.Entry<Character, Integer> entrySet : characterFrequencies.entrySet()) {
            if (entrySet.getValue() > occurance) {
                occurance = entrySet.getValue();
                mostFrequentChar = entrySet.getKey();
            }
        }
        return mostFrequentChar;
    }

    private static Map<Character, Integer> getStartingCharaterFrequencies(String[] splitWords) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (String word : splitWords) {
            char secondCharacter = Character.toLowerCase(word.charAt(1));
            if (!frequencies.containsKey(secondCharacter)) {
                frequencies.put(secondCharacter, 1);
            } else {
                frequencies.put(secondCharacter, frequencies.get(secondCharacter) + 1);
            }
        }
        return frequencies;
    }

    /*
    13. Gets in a String and returns its most frequent character
    Input: "aabbbcdd" → Output: 'b'
    */
    public static char getMostFrequentCharacter(String input) {
        Map<Character, Integer> characterFrequencies = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (!characterFrequencies.containsKey(key)) {
                characterFrequencies.put(key, 1);
            } else {
                characterFrequencies.put(key, characterFrequencies.get(key) + 1);
            }
        }
        int occurance = 0;
        char mostFrequentChar = '\u0000';
        for (Map.Entry<Character, Integer> entrySet : characterFrequencies.entrySet()) {
            if (entrySet.getValue() > occurance) {
                occurance = entrySet.getValue();
                mostFrequentChar = entrySet.getKey();
            }
        }
        return mostFrequentChar;
    }

    /*
    14. Gets in two Strings containing words and returns with a list of those words
    that appear only once and in exactly one list. The list should be sorted in alphabetical order.
    Input: "holiday apple banana apple" and "banana fruit holiday blues"
    Output: ["blues", "fruit"]
    */
    public static List<String> getCommonDistinctWords(String first, String second) {
        StringBuilder sb = new StringBuilder();
        String merged = sb.append(first).append(" ").append(second).toString();
        String[] splitText = merged.split(" ");
        Map<String, Integer> frequencies = new TreeMap<>();
        for (String word : splitText) {
            if (!frequencies.containsKey(word)) {
                frequencies.put(word, 1);
            } else {
                frequencies.put(word, frequencies.get(word) + 1);
            }
        }
        List<String> commonDistinctWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entrySet : frequencies.entrySet()) {
            if (entrySet.getValue() == 1) {
                commonDistinctWords.add(entrySet.getKey());
            }
        }
        return commonDistinctWords;
    }

    /*
   15. Given a string, finds the length of the smallest substring that contains all
   the unique characters from the original string.
   Input: "aabcbcdbca" Output: 4 Explanation: The smallest substring containing all unique characters is "dbca"
   */
    public static int getLengthOfSmallestUniqueSubstring(String input) {
        Set<Character> allUniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            allUniqueChars.add(c);
        }
        int numberOfUniqueChars = allUniqueChars.size();
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < input.length(); i++) {
            Set<Character> currentChars = new HashSet<>();
            for (int j = i; j < input.length(); j++) {
                currentChars.add(input.charAt(j));
                if (currentChars.size() == numberOfUniqueChars) {
                    int currentLength = j - i + 1;
                    minLength = Math.min(minLength, currentLength);
                    break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    /*
    16. Given a string, returns the first non-repeating character.
    Input: "aabbcdeff"
    Output: "c"
    */
    public static char getFirstNonRepeatingCharacter(String input) {
        Map<Character, Integer> frequencies = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!frequencies.containsKey(input.charAt(i))) {
                frequencies.put(input.charAt(i), 1);
            } else {
                frequencies.put(input.charAt(i), frequencies.get(input.charAt(i)) + 1);
            }
        }
        char result = '\u0000';
        for (Map.Entry<Character, Integer> entrySet : frequencies.entrySet()) {
            if (entrySet.getValue() == 1) {
                result = entrySet.getKey();
                break;
            }
        }
        return result;
    }

    /*
   17. Given a list of words, groups them into lists of anagrams.
   Input: ["act", "cat", "dog", "god", "tac"]
   Output: [[act, cat, tac], [dog, god]]
   */
    public static List<Set<String>> getAnagramGroups(List<String> words) {
        Map<String, Set<String>> groupedWords = new HashMap<>();
        for (String word : words) {
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);
            if (groupedWords.containsKey(key)) {
                Set<String> currentWords = groupedWords.get(key);
                currentWords.add(word);
            } else {
                Set<String> values = new TreeSet<>();
                values.add(word);
                groupedWords.put(key, values);
            }
        }
        List<Set<String>> grouppedWordList = new ArrayList<>();
        for (Map.Entry<String, Set<String>> grouppedWordEntry : groupedWords.entrySet()) {
            grouppedWordList.add(grouppedWordEntry.getValue());
        }
        return grouppedWordList;
    }

    /*
    18. Finds the most frequent word in a list of strings.
    Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
    Output: "apple"
    */
    public static String getMostFrequentWord(List<String> words) {
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }
        int occurrence = 0;
        String mostFrequentWord = "";
        for (Map.Entry<String, Integer> entrySet : frequency.entrySet()) {
            if (entrySet.getValue() > occurrence) {
                occurrence = entrySet.getValue();
                mostFrequentWord = entrySet.getKey();
            }
        }
        return mostFrequentWord;
    }

    /*
    19. Returns the list of duplicated elements in an array.
    Input: [1, 2, 3, 2, 4, 1, 5]
    Output: [1, 2]
    */
    public static Set<Integer> getDuplicatedElements(int[] numbers) {
        Map<Integer, Integer> frequency = getFrequency(numbers);
        Set<Integer> duplicatedElements = new HashSet<>();
        for (Map.Entry<Integer, Integer> entrySet : frequency.entrySet()) {
            if (entrySet.getValue() >= 2) {
                duplicatedElements.add(entrySet.getKey());
            }
        }
        return duplicatedElements;
    }

    /*
    20. Given two arrays, check if they contain the same elements with the same frequencies.
    Input: [1, 2, 2, 3], [2, 1, 3, 2]
    Output: true
    */
    public static boolean areElementsIdentical(int[] first, int[] second) {
        Map<Integer, Integer> firstFrequency = getFrequency(first);
        Map<Integer, Integer> secondFrequency = getFrequency(second);
        return firstFrequency.equals(secondFrequency);
    }

    private static Map<Integer, Integer> getFrequency(int[] first) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : first) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }
        }
        return frequency;
    }

    /*
    21. Find the minimum number of character changes to make all characters in the string the same.
    Input: "aabbc"
    Output: 3 (change 2 b’s and 1 c to a)
    */
    public static int minChangesToUniformStrings(String input) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if (frequency.containsKey(currentCharacter)) {
                frequency.put(currentCharacter, frequency.get(currentCharacter) + 1);
            } else {
                frequency.put(currentCharacter, 1);
            }
        }
        int topOccurrence = 0;
        for (Map.Entry<Character, Integer> entrySet : frequency.entrySet()) {
            if (entrySet.getValue() > topOccurrence) {
                topOccurrence = entrySet.getValue();
            }
        }
        return input.length() - topOccurrence;
    }

    /*
    22. Returns the list of elements that appear exactly once in the array.
    Input: [1, 2, 2, 3, 4, 4, 5]
    Output: [1, 3, 5]
    */
    public static List<Integer> getUniqueElements(List<Integer> numbers) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }
        }
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entrySet : frequency.entrySet()) {
            if (entrySet.getValue() == 1) {
                uniqueNumbers.add(entrySet.getKey());
            }
        }
        return uniqueNumbers;
    }

    /*
    23. Given an array, group numbers by their frequency.
    Input: [1, 2, 2, 3, 3, 3]
    Output: {1=[1], 2=[2], 3=[3]}
    */
    public static Map<Integer, Integer> getFrequency(List<Integer> numbers) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer number : numbers) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }
        }
        return frequency;
    }

    /*
    24. Given a map of String → Integer, creates a new map of Integer → List<String> (invert the mapping).
    Input: {a=1, b=2, c=1}
    Output: {1=[a, c], 2=[b]}
    */
    public static Map<Integer, List<String>> invert(Map<String, Integer> input) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entrySet : input.entrySet()) {
            int key = entrySet.getValue();
            String value = entrySet.getKey();
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(value);
        }
        return result;
    }
}


