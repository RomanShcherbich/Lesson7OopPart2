package by.tms.validationservice;

public class UserValidationService {

    /* (3 ;15) */
    public void validate(User user) {
        String firstName = user.getFirstName();
        int nameLength = firstName.length();
        if (nameLength > 3 && nameLength < 15) {
            System.out.println("Name is valid");
        } else {
            System.out.println(UserValidationException.INVALID_NAME_ERROR);
        }
    }

}
