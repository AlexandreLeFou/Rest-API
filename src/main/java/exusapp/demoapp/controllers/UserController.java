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


    @RequestMapping(value ="/allusers")
    public String getAllTheUsers( ModelMap modelMap) { //return list of users from db
        List<User> users = userRepository.findAll();
       // System.out.println(users);
        modelMap.addAttribute("users",users);
        return "display-all-data";
    }

    @RequestMapping("/saveUser")
   public String saveNewUserr(User user,ModelMap modelMap) { //expose it out a as bean -spring container-
        userRepository.save(user);
        List<User> users = userRepository.findAll();
        modelMap.addAttribute("users",users);
        return "display-all-data";

    }


    @PostMapping(value ="/loaduser")
    public List<User> persist(@RequestBody final User user,ModelMap modelMap){ //db upon save display all values
        userRepository.save(user);
      //  List<User> users = userRepository.findAll();
      //  modelMap.addAttribute("users",users);
        //return "display-all-data";
        return userRepository.findAll();

    }

        /*

{"id":3, "first_name":Alexandra, "last_name":alexandropoulou, "email":alexandra@gmail.com, "gender":woman, "ip_address":"99.000.998"}
         */
    }

