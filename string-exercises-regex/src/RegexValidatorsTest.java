import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexValidatorsTest {
    @Test
    void shouldReturnIfEan13() {
        //given
        String valid = "1234567891011";
        String invalidShort = "123456789101";
        String invalidChar = "123456789101a";
        //when, then
        assertTrue(RegexValidators.isValidEan13(valid));
        assertFalse(RegexValidators.isValidEan13(invalidShort));
        assertFalse(RegexValidators.isValidEan13(invalidChar));
    }

    @Test
    void shouldReturnIfItalianMobileNumber() {
        //given
        String valid9 = "+39312345678";
        String valid10 = "+393123456789";
        String invalidPrefix = "+36312345678";
        String invalidStartDigit = "+39412345678";
        String invalidLength = "+3931234567";
        //when, then
        assertTrue(RegexValidators.isValidItalianMobileNumber(valid9));
        assertTrue(RegexValidators.isValidItalianMobileNumber(valid10));
        assertFalse(RegexValidators.isValidItalianMobileNumber(invalidPrefix));
        assertFalse(RegexValidators.isValidItalianMobileNumber(invalidStartDigit));
        assertFalse(RegexValidators.isValidItalianMobileNumber(invalidLength));
    }

    @Test
    void shouldReturnIfHelloOrWorld() {
        //given,when,then
        assertTrue(RegexValidators.isHelloOrWorld("Hello"));
        assertTrue(RegexValidators.isHelloOrWorld("world"));
        assertFalse(RegexValidators.isHelloOrWorld("hello world"));
    }

    @Test
    void shouldReturnIfSpecialCode() {
        //given
        String valid = "abcABcd93x1!#@.";
        String invalid1stDigit = "1bcABcd93x1!#@.";
        String invalid4thLower = "abcaBcd93x1!#@.";
        String invalid9thRangeE = "abcABcd96x1!#@.";
        String invalid15thNoDot = "abcABcd93x1!#@1";
        //when, then
        assertTrue(RegexValidators.isSpecialCode(valid));
        assertFalse(RegexValidators.isSpecialCode(invalid1stDigit));
        assertFalse(RegexValidators.isSpecialCode(invalid4thLower));
        assertFalse(RegexValidators.isSpecialCode(invalid9thRangeE));
        assertFalse(RegexValidators.isSpecialCode(invalid15thNoDot));
    }
}
