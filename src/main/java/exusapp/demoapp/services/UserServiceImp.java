package exusapp.demoapp.services;


import exusapp.demoapp.entities.User;
import exusapp.demoapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository repository;

    public UserRepository getRepository() {
        return repository;
    }

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
    @Override
    public List<User> getUsersByEmail(String email) {
        return repository.findUsersByEmail(email);
    }


}

