package org.filip.users.ws;

import org.filip.users.exceptions.UserDoesNotExistException;
import org.filip.users.exceptions.UserAlreadyExistsException;
import org.filip.users.model.User;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by fghimpeteanu on 9/27/2016.
 */
@WebService(name = "UsersService")
public interface UsersService {
    void addUser(@WebParam(name = "userID") int userId, @WebParam(name = "user") User theUser)
            throws UserAlreadyExistsException;
    User getUser(@WebParam(name = "userID") int userId);
    void deleteUser(@WebParam(name = "userID") int userId) throws UserDoesNotExistException;
    void updateUser(@WebParam(name = "userID") int userId, @WebParam(name = "newUser") User newUser);
    List<User> getAllUsers();
}
