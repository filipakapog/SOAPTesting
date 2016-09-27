package org.filip.users.ws.impl;

import org.filip.users.exceptions.UserDoesNotExistException;
import org.filip.users.exceptions.UserAlreadyExistsException;
import org.filip.users.model.User;
import org.filip.users.ws.UsersService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fghimpeteanu on 9/27/2016.
 */
@WebService(name = "UsersServiceImpl", endpointInterface = "org.filip.users.ws.UsersService")
public class UsersServiceImpl implements UsersService {
    Map<Integer, User> usersList = new HashMap<>();

    public UsersServiceImpl() {
        usersList.put(1, new User("Ion", "Dolanescu", 32, 1));
        usersList.put(2, new User("Johnny", "Bravo", 55, 2));
        usersList.put(3, new User("Fratele", "Salam", 35, 3));
    }

    public void addUser(int userId, User theUser) throws UserAlreadyExistsException {
        if (usersList.isEmpty() || null == usersList.get(userId)) {
            // The user is not in the list, so we add the user.
            usersList.put(userId, theUser);
        } else {
            // The user is already in the list
            throw new UserAlreadyExistsException(
                    "User was not added to the list!", "User \"" + theUser + "\" is already in the list!");
        }
    }

    public User getUser(int userId) {
        return usersList.get(userId);
    }

    public void deleteUser(int userId) throws UserDoesNotExistException {
        if (!usersList.isEmpty() && null != usersList.get(userId)) {
            usersList.remove(userId);
        } else {
            throw new UserDoesNotExistException(
                        "User was not deleted from the list!", "User with id \"" + userId + "\" does not exist!");
        }
    }


    public void updateUser(int userId, User newUser) {
        if (!usersList.isEmpty() && null != usersList.get(userId)) {
            // The user is not in the list, so we add the user.
            usersList.put(userId, newUser);
        } // else there will be no update
    }

    public List<User> getAllUsers() {
        return (List<User>) usersList.values();
    }
}
