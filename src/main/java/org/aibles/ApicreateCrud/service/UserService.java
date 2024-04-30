package org.aibles.ApicreateCrud.service;

import org.aibles.ApicreateCrud.dto.request.UserCreationRequest;
import org.aibles.ApicreateCrud.dto.request.UserUpdatedRequest;
import org.aibles.ApicreateCrud.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(UserCreationRequest request) ;
    User updateUser(String userId , UserUpdatedRequest request );
    User getUser(String userId );
    List<User> getAll ();
}
