package com.nbicocchi.building_spring_application.service;


import com.nbicocchi.building_spring_application.model.UserModel;
import com.nbicocchi.building_spring_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public UserModel updateUser(Long id, UserModel userModelDetails) {
        UserModel userModel = userRepository.findById(id).orElse(null);
        if (userModel != null) {
            userModel.setName(userModelDetails.getName());
            userModel.setEmail(userModelDetails.getEmail());
            return userRepository.save(userModel);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

