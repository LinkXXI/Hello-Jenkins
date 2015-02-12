package ca.sheridancollege;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Name: Kevin Lee
 * Student ID: 991283860
 * Assignment: Assignment 1
 *
 * Class for testing Password for Assignment 1
 */

public class TestPassword {

    private Password password;

    @Test
    /**
     * This test insures that validateLength() returns true when the password is exactly 8 characters.
     */
    public void testValidatePasswordLength(){
        password = new Password("123abc-a");
        boolean result = password.validateLength();
        assertTrue("Password did not pass validation, length did not validate as expected", result);
    }

    /**
     * This test insures that validateLength() returns false when password is less than 8 characters.
     */
    @Test
    public void testValidatePasswordLengthBad(){
        password = new Password("123abc-");
        boolean result = password.validateLength();
        assertFalse("Password returned valid, should return false", result);
    }

    /**
     * This test insures that validateLength() returns true when password is more than 8 characters.
     */
    @Test
    public void testValidatePasswordLength9char(){
        password = new Password("123abc-ab");
        boolean result = password.validateLength();
        assertTrue("Password did not pass validation, length should be valid", result);
    }

    @Test
    /**
     * This test validates that validateAlpha returns true when the password consists only of alphanumeric characters.
     */
    public void testValidateAlpha(){
        password = new Password("1234abcd");
        boolean result = password.validateAplha();
        assertTrue("Password should have passed the validation.", result);
    }

    @Test
    /**
     * This test validates that validateAplha() returns false when there is a non-alphanumeric character present.
     */
    public void testValidateAlphaBad(){
        password = new Password("123-abcd");
        boolean result = password.validateAplha();
        assertFalse("Password should not haved passed validation", result);
    }

    @Test
    /**
     * This test ensures that validate2Digits() returns true when there are atleast 2 digits in the password.
     */
    public void test2Digits(){
        password = new Password("12abdcef");
        boolean result = password.validate2Digits();
        assertTrue("Password should pass validation, should be valid", result);
    }

    @Test
    /**
     * This test ensures that validate2Digits() returns false when there is only 1 digit in the password
     */
    public void test1Digit(){
        password = new Password("1abcdefg");
        boolean result = password.validate2Digits();
        assertFalse("Password should not have passed validation", result);
    }

    @Test
    /**
     * This test ensures that validate2Digits() returns true when there is 3 digits in the password
     */
    public void test3Digits(){
        password = new Password("123abcde");
        boolean result = password.validate2Digits();
        assertTrue("Password should have passed validation", result);
    }
}
