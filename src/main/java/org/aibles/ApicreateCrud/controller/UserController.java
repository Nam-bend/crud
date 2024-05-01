package org.aibles.ApicreateCrud.controller;

import org.aibles.ApicreateCrud.dto.request.UserCreationRequest;
import org.aibles.ApicreateCrud.entity.User;
import org.aibles.ApicreateCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping()
    List<User> getAll() {
        return userService.getAll();
    }
    @GetMapping("/{userId}")
    User getUser( @PathVariable  String userId){
        return  userService.getUser(userId);
    }
}
