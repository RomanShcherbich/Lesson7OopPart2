package by.tms.validationservice;

public class UserValidationDemo {

    public static void main(String[] args) {
        User validUser = new User("Roman");
        User invalidUser2 = new User("Li");
        User invalidUser16 = new User("1234567890123456");
        UserValidationService validationService = new UserValidationService();
        System.out.println("Validation 1");
        System.out.println("--------------");
        validationService.validate(validUser);
        System.out.println("\nValidation 2");
        System.out.println("--------------");
        validationService.validate(invalidUser2);
        System.out.println("\nValidation 3");
        System.out.println("--------------");
        validationService.validate(invalidUser16);
   }

}
