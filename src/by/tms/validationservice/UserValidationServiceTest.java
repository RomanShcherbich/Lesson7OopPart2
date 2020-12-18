package by.tms.validationservice;

public class UserValidationServiceTest {

    public static void ShortFirstNameTest() {
        User user = new User("Li");
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validate(user);
        String expectedValidationMessage = UserValidationException.INVALID_NAME_ERROR;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("PASSED Short First Name Test");
        } else {
            System.out.println("FAILED Short First Name Test");
        }
    }

    public static void LongFirstNameTest() {
        User user = new User("Li Jecky Chan Ninja");
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validate(user);
        String expectedValidationMessage = UserValidationException.INVALID_NAME_ERROR;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("PASSED Long First Name Test");
        } else {
            System.out.println("FAILED Long First Name Test");
        }
    }

    public static void ValidFirstNameTest() {
        User user = new User("Roman");
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validate(user);
        String expectedValidationMessage = UserValidationService.NAME_IS_VALID;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("PASSED Valid First Name Test");
        } else {
            System.out.println("FAILED Valid First Name Test");
        }
    }


}
