package org.filip.users.exceptions;

/**
 * Created by fghimpeteanu on 9/27/2016.
 */
public class UserException extends Exception {
    private String exceptionDetails;

    public UserException(String reason, String exceptionDetails) {
        super(reason);
        this.exceptionDetails = exceptionDetails;
    }

    public String getExceptionDetails() {
        return exceptionDetails;
    }
}
