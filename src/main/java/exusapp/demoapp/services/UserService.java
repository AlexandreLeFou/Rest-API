package exusapp.demoapp.services;

import exusapp.demoapp.entities.User;

import java.util.List;

public interface UserService {

    List<User> getUsersByEmail(String email);
    List<User> getAllUsers() ;
    User saveUser(User user); //new owner




}
