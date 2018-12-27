package exusapp.demoapp.controllers;


import exusapp.demoapp.models.User;
import exusapp.demoapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

@GetMapping("/hello")
public String getHellomsg(){return "Hello this is a demo app regarding Rest API";}


        @PostMapping("/owners")
        public User createNewUser(@RequestBody User user){


            return ;
        }

}
