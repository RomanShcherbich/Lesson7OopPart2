package by.tms.validationservice;

public class UserValidationService {

    public static final String NAME_IS_VALID = "Name is valid";

    /* (3 ;15) */
    public String validate(User user) {
        String firstName = user.getFirstName();
        int nameLength = firstName.length();
        if (nameLength > 3 && nameLength < 15) {
            return NAME_IS_VALID;
        } else {
            return UserValidationException.INVALID_NAME_ERROR;
        }
    }

}
