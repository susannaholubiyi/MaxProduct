import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {
    @Test
    public void validatePhoneNumberTest(){
        String phoneNumber = "";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberIsNotEmptyTest(){
        String phoneNumber = "08100786268";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberHasValidAreaCodeTest(){
        String phoneNumber = "+2348100786268";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberHasValidAreaCode4Test(){
        String phoneNumber = "+2349035067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberHasValidAreaCode5Test(){
        String phoneNumber = "+2347115067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberHasValidAreaCode6Test(){
        String phoneNumber = "+2347115a067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse((isPhoneNumberValid));
    }
    @Test
    public void validatePhoneNumberHasValidAreaCode7Test(){
        String phoneNumber = "a2347115067896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberHasValidAreaCode8Test(){
        String phoneNumber = "23470oooooooo";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberHasValidAreaCode9Test(){
        String phoneNumber = "234 701 506 7896";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue((isPhoneNumberValid));
    }

    @Test
    public void validatePhoneNumberHasValidAreaCode10Test(){
        String phoneNumber = "7012345678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue((isPhoneNumberValid));
    }

    @Test
    public void  validateEmailAddressTest(){
        String email = "";
        boolean isValidEmail = DataValidator.isValidSemicolonEmail(email);
        assertFalse((isValidEmail));
    }
    @Test
    public void  validateEmailAddressTest2(){
        String email = "o.olubiyi@semicolon.africa";
        boolean isValidEmail = DataValidator.isValidSemicolonEmail(email);
        assertTrue(isValidEmail);
    }
}