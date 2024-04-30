package org.aibles.ApicreateCrud.service;

import org.aibles.ApicreateCrud.dto.request.UserCreationRequest;
import org.aibles.ApicreateCrud.dto.request.UserUpdatedRequest;
import org.aibles.ApicreateCrud.entity.User;
import org.aibles.ApicreateCrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserCreationRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String userId, UserUpdatedRequest request) {
        User user = getUser(userId);
        user.setUsername(request.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException(" User not found "));
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
