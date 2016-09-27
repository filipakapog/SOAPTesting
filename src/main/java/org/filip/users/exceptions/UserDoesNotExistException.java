package org.filip.users.exceptions;

/**
 * Created by fghimpeteanu on 9/9/2016.
 */
public class UserDoesNotExistException extends UserException {

    public UserDoesNotExistException(String reason, String exceptionDetails) {
        super(reason, exceptionDetails);
    }
}
