package com.nbicocchi.building_spring_application.controller;

import com.nbicocchi.building_spring_application.model.UserModel;
import com.nbicocchi.building_spring_application.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id) {
        LOG.info("getUserById() invoked");
        return userService.getUserById(id);
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel userModel) {
        LOG.info("createUser() invoked");
        return userService.createUser(userModel);
    }

    @PutMapping("/{id}")
    public UserModel updateUser(@PathVariable Long id, @RequestBody UserModel userModelDetails) {
        LOG.info("updateUser() invoked");
        return userService.updateUser(id, userModelDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        LOG.info("deleteUser() invoked");
        userService.deleteUser(id);
    }
}

