package com.devops.userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody String user) {
        return "User received: " + user;
    }
}
@GetMapping("/test")
public String test() {
    return "SCRUM-3 working";
}
