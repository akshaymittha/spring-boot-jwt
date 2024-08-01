package com.example.controller;

import com.example.entity.Users;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService service;

    @GetMapping("/user")
    public List<Users> getUser() {
        System.out.println("getting users");
        return service.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUSer(Principal principal) {
        return principal.getName();
    }
}
