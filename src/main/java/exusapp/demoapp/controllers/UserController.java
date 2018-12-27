package exusapp.demoapp.controllers;


import exusapp.demoapp.entities.User;
import exusapp.demoapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;


    @RequestMapping(value ="/allUsers")
    public String getAllTheUsers( ModelMap modelMap) { //return list of users from db
        List<User> users = userRepository.findAll();
       // System.out.println(users);
        modelMap.addAttribute("users",users);
        return "display-all-data";
    }


    @PostMapping(value ="/saveUser")
    public String saveTheUser(@RequestBody final User user,ModelMap modelMap){ //db upon save display all values
        userRepository.save(user);
        List<User> users = userRepository.findAll();
        // System.out.println(users);
        modelMap.addAttribute("users",users);
        return "display-all-data";
    }

    @RequestMapping("/getUser")//email
    public String searchEmail(Model model, @RequestParam(name = "email") String email) {
        model.addAttribute("users", userRepository.findUsersByEmail(email));
        return "search-email";
    }
        /*

{"id":3, "first_name":Alexandra, "last_name":alexandropoulou, "email":alexandra@gmail.com, "gender":woman, "ip_address":"99.000.998"}
         */
    }

