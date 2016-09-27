package org.filip.users.exceptions;

/**
 * Created by fghimpeteanu on 9/9/2016.
 */
public class UserAlreadyExistsException extends UserException {

    public UserAlreadyExistsException(String reason, String exceptionDetails) {
        super(reason, exceptionDetails);
    }
}
