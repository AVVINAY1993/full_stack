package com.user.userformdetails.controller;

import com.user.userformdetails.entity.UserPojo;
import com.user.userformdetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular app
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/addUser")
    public UserPojo addUser(@RequestBody UserPojo userPojo) {
        return userService.addUser(userPojo);
    }

    @GetMapping("/getAllUsers")
    public List<UserPojo> getAllUsers(){
        return userService.getAllUsers();
    }
}
