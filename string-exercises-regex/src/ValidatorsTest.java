import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorsTest {
    @Test
    void shouldReturnIfEan13() {
        //given
        String valid = "1234567891011";
        String invalidShort = "123456789101";
        String invalidChar = "123456789101a";
        //when, then
        assertTrue(Validators.isValidEan13(valid));
        assertFalse(Validators.isValidEan13(invalidShort));
        assertFalse(Validators.isValidEan13(invalidChar));
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
        assertTrue(Validators.isValidItalianMobileNumber(valid9));
        assertTrue(Validators.isValidItalianMobileNumber(valid10));
        assertFalse(Validators.isValidItalianMobileNumber(invalidPrefix));
        assertFalse(Validators.isValidItalianMobileNumber(invalidStartDigit));
        assertFalse(Validators.isValidItalianMobileNumber(invalidLength));
    }

    @Test
    void shouldReturnIfHelloOrWorld() {
        //given,when,then
        assertTrue(Validators.isHelloOrWorld("Hello"));
        assertTrue(Validators.isHelloOrWorld("world"));
        assertFalse(Validators.isHelloOrWorld("hello world"));
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
        assertTrue(Validators.isSpecialCode(valid));
        assertFalse(Validators.isSpecialCode(invalid1stDigit));
        assertFalse(Validators.isSpecialCode(invalid4thLower));
        assertFalse(Validators.isSpecialCode(invalid9thRangeE));
        assertFalse(Validators.isSpecialCode(invalid15thNoDot));
    }
}
