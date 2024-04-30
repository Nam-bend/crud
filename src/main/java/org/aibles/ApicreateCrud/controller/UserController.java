package org.aibles.ApicreateCrud.controller;

import org.aibles.ApicreateCrud.dto.request.UserCreationRequest;
import org.aibles.ApicreateCrud.entity.User;
import org.aibles.ApicreateCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/v1/user")
public class UserController {
    private final  UserService userService ;
    @Autowired
    UserController(UserService userService){
        this.userService=userService ;
    }
  @PostMapping()
    User createUser( @RequestBody UserCreationRequest request){
        return userService.createUser(request);
  }
@GetMapping()
    List<User> getAll(){
        return userService.getAll();
}
}
