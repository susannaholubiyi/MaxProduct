public class DataValidator {
    public static void main(String[] args) {

    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll(" ", "");
        String regex = "((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
        return phoneNumber.matches(regex);
    }


    public static boolean isValidSemicolonEmail(String email) {
        email = email.toLowerCase();
        String regex = "([a-z]\\.)?[a-z]+@(enum|semicolon|learnspace|native.semicolon).africa";
        return email.matches(regex);
    }
}
