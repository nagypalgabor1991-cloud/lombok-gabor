import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindingPalindromesTest {
    @Test
    void shouldReturnTrueForEmptyLine() {
        String lineToCheck = "";
        boolean result = FindingPalindromes.isPalindrome(lineToCheck);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnTrueForSingleCharacter() {
        String lineToCheck = "a";
        boolean result = FindingPalindromes.isPalindrome(lineToCheck);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnTrueForPalindrome() {
        String lineToCheck = "dad";
        boolean result = FindingPalindromes.isPalindrome(lineToCheck);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnTrueForLongerPalindrome() {
        String lineToCheck = "level";
        boolean result = FindingPalindromes.isPalindrome(lineToCheck);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnFalseForNonPalindrome() {
        String lineToCheck = "palindrome";
        boolean result = FindingPalindromes.isPalindrome(lineToCheck);
        Assertions.assertFalse(result);
    }
}