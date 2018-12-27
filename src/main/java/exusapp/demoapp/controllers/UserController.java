package exusapp.demoapp.controllers;


import exusapp.demoapp.entities.User;
import exusapp.demoapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;


   // @GetMapping("/hello")
  //  public String getHellomsg() {
  //      return "Hello this is a demo app regarding Rest API";
  //  }


    @RequestMapping(value ="/allowners")
    public String getAllTheUsers( ModelMap modelMap) { //return list of users from db
        List<User> users = userRepository.findAll();
        System.out.println(users);
        modelMap.addAttribute("users",users);
        return "display-all-data";
    }

    @PostMapping(value ="/loadowners")
    public List<User> persist(@RequestBody final User user){ //db upon save display all values
        userRepository.save(user);
        return userRepository.findAll();
        }
    }

