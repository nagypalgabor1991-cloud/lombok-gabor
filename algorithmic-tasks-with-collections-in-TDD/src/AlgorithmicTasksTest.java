import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmicTasksTest {
    @Test
    void shouldRemoveDuplicates() {
        //given
        String original = "banana";
        //when
        String result = AlgorithmicTasks.removeDuplications(original);
        //then
        assertEquals("ban", result);
    }

    @ParameterizedTest
    @MethodSource(value = "provideTestAnagramStrings")
    public void shouldBeAnagrams(List<String> params) {
        assertTrue(AlgorithmicTasks.areAnagrams(params.get(0), params.get(1)));
    }

    public static Stream<List<String>> provideTestAnagramStrings() {
        List<String> nullList = new ArrayList<>();
        nullList.add(null);
        nullList.add(null);
        return Stream.of(
                List.of("", ""),
                List.of("baba", "abba"),
                List.of("b", "b"),
                List.of("bbbbbbb", "bbbbbbb"),
                nullList
        );
    }

    @ParameterizedTest
    @MethodSource(value = "provideTestNotAnagramStrings")
    public void shouldNotBeAnagrams(List<String> params) {
        assertFalse(AlgorithmicTasks.areAnagrams(params.get(0), params.get(1)));
    }

    public static Stream<List<String>> provideTestNotAnagramStrings() {
        List<String> nullList = new ArrayList<>();
        nullList.add(null);
        nullList.add("aa");
        return Stream.of(
                List.of("aaa", "aa"),
                List.of("", "vsvsd"),
                nullList,
                List.of("aaa", "aaab")
        );
    }

    @Test
    public void shouldCreateUnion() {
        //given
        var first = List.of(1, 2, 2, 1, 1);
        var second = List.of(1, 3, 4);
        //when
        Set<Integer> actual = AlgorithmicTasks.getUnion(first, second);
        //then
        assertEquals(actual, Set.of(1, 2, 3, 4));
    }

    @Test
    void shouldCountFrequency() {
        //given
        List<Integer> values = List.of(1, 2, 2, 3, 2, 1);
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(2, 3);
        expected.put(3, 1);
        //when
        var result = AlgorithmicTasks.countFrequency(values);
        //then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc", "afseg", "cba", "?xt"})
    void shouldAllLettersBeUnique(String input) {
        //given, when
        boolean result = AlgorithmicTasks.containsOnlyUniqueLetters(input);
        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abac", "afsega", "cbab", "?xt?"})
    void shouldNotAllLettersBeUnique(String input) {
        //given, when
        boolean result = AlgorithmicTasks.containsOnlyUniqueLetters(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldMergeSortedListsAndSort() {
        //given
        var first = List.of(1, 3, 5);
        var second = List.of(2, 4, 6);
        //when
        var result = AlgorithmicTasks.merge(first, second);
        //then
        assertEquals(List.of(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    void shouldReturnSecondLargestNumber() {
        //given
        List<Integer> input = List.of(3, 1, 4, 1, 9, 9);
        //when
        int result = AlgorithmicTasks.getSecondLargestNumber(input);
        //then
        assertEquals(9, result);
    }

    @Test
    void shouldReturnCommonElements() {
        //given
        List<Integer> first = List.of(1, 2, 3, 4);
        List<Integer> second = List.of(3, 4, 5, 6);
        //when
        var result = AlgorithmicTasks.getCommonElements(first, second);
        var expected = List.of(3, 4);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnMostFrequentWordFromList() {
        //given
        String input = "Hello hello world!";
        //when
        var result = AlgorithmicTasks.getMostFrequentWord(input);
        var excepted = "hello";
        //then
        assertEquals(excepted, result);
    }

    @Test
    void shouldCountDistinctWords() {
        //given
        String sentence = "The cat and the dog.";
        //when
        var result = AlgorithmicTasks.countDistinctWords(sentence);
        //then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnSingleElements() {
        //given
        final var original = List.of(4, 5, 4, 6, 7, 6);
        //when
        final var filteredList = AlgorithmicTasks.getSingleElements(original);
        //then
        assertEquals(Set.of(7, 5), filteredList);
    }

    @Test
    void shouldGetMostFrequentCharacter() {
        //given
        var input = "\"apple\", \"ant\", \"banana\", \"blue\", \"blues\", \"ceiling\", \"Bamboozle\"";
        //when
        char mostFrequentStartingCharacter = AlgorithmicTasks.getMostFrequentStartingLetter(input);
        //then
        assertEquals('b', mostFrequentStartingCharacter);
    }

    @Test
    void shouldReturnMostFrequentCharacter() {
        //given
        var input = "aabbbcdd";
        //when
        var result = AlgorithmicTasks.getMostFrequentCharacter(input);
        //then
        assertEquals('b', result);
    }

    @Test
    void shouldReturnDistinctWords() {
        //given
        String first = "holiday apple banana apple";
        String second = "banana fruit holiday blues";
        List<String> expected = List.of("blues", "fruit");
        //when
        List<String> result = AlgorithmicTasks.getCommonDistinctWords(first, second);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnLengthOfSmallestUniqueSubstring() {
        //given
        String input = "aabcbcdbca";
        //when
        var result = AlgorithmicTasks.getLengthOfSmallestUniqueSubstring(input);
        //then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnFirstNonRepeatingCharacter() {
        //given
        String input = "aabbcdeff";
        var expected = 'c';
        //when
        var result = AlgorithmicTasks.getFirstNonRepeatingCharacter(input);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldGroupAnagrams() {
        //given
        List<String> original = List.of("act", "cat", "dog", "god", "tac", "ogd");
        List<Set<String>> expected = new ArrayList<>();
        Set<String> firstSet = new TreeSet<>();
        firstSet.add("cat");
        firstSet.add("tac");
        firstSet.add("act");
        Set<String> secondSet = new TreeSet<>();
        secondSet.add("dog");
        secondSet.add("god");
        secondSet.add("ogd");
        expected.add(firstSet);
        expected.add(secondSet);
        //when
        final var result = AlgorithmicTasks.getAnagramGroups(original);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnMostFrequentWord() {
        //given
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        //when
        var result = AlgorithmicTasks.getMostFrequentWord(words);
        //then
        assertEquals("apple", result);
    }

    @Test
    void shouldReturnDuplicatedElements() {
        //given
        int[] numbers = {1, 2, 3, 2, 4, 1, 5};
        //when
        var result = AlgorithmicTasks.getDuplicatedElements(numbers);
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldContainSameElementsWithSameFrequency() {
        //given
        int[] first = {1, 2, 2, 3};
        int[] second = {2, 1, 3, 2};
        //when
        var result = AlgorithmicTasks.areElementsIdentical(first, second);
        //then
        assertTrue(result);
    }

    public static List<int[]> provideArrays() {
        int[] firstCase = {5, 6, 7, 8};
        int[] secondCase = {1, 2, 3};
        int[] thirdCase = {0, 1, 2, 3};
        List<int[]> arrays = new ArrayList<>();
        arrays.add(firstCase);
        arrays.add(secondCase);
        arrays.add(thirdCase);
        return arrays;
    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    void shouldNotContainSameElementsWithSameFrequency(int[] input) {
        //given
        int[] first = {1, 2, 2, 3};
        //when
        var result = AlgorithmicTasks.areElementsIdentical(first, input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldGetMinChangesToUniformStrings() {
        //given
        String input = "aabbc";
        //when
        var result = AlgorithmicTasks.minChangesToUniformStrings(input);
        //then
        assertEquals(3, result);
    }

    @Test
    void shouldReturnListOfUniqueElements() {
        //given
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        //when
        List<Integer> result = AlgorithmicTasks.getUniqueElements(numbers);
        List<Integer> expected = List.of(1, 3, 5);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldGetFrequency() {
        //given
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3);
        //when
        var result = AlgorithmicTasks.getFrequency(numbers);
        Map<Integer, Integer> excepted = new HashMap<>();
        excepted.put(1, 1);
        excepted.put(2, 2);
        excepted.put(3, 3);
        //then
        assertEquals(excepted, result);
    }

    @Test
    void shouldGetInvertMap() {
        //given
        Map<String, Integer> input = new HashMap<>();
        input.put("a", 1);
        input.put("b", 2);
        input.put("c", 1);
        //when
        var result = AlgorithmicTasks.invert(input);
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, List.of("a", "c"));
        expected.put(2, List.of("b"));
        //then
        assertEquals(expected, result);
    }
}
