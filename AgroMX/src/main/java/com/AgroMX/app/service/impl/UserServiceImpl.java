package com.AgroMX.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.AgroMX.app.model.User;
import com.AgroMX.app.repository.UserRepository;
import com.AgroMX.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public User getUserById(Long id) {
        Optional < User > existingUser = userRepository.findById(id);
        return existingUser.orElseThrow(() -> new IllegalStateException("No existe el usuario con el" + id));
    }

    @Override
    public User getUserByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserByEmail'");
    }

    @Override
    public User updateUser(User user, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
}
