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
    user.setId(null);
    return userRepository.save(user);
  }

  @Override
  public User getUserById(Long id) {
    Optional<User> existingUser = userRepository.findById(id);
    return existingUser.orElseThrow(() -> new IllegalStateException("No existe el usuario con el" + id));
  }

  @Override
  public User getUserByEmail(String email) {
    Optional<User> existingUser = userRepository.findByEmail(email);
    return existingUser.orElseThrow(() -> new IllegalStateException("No existe el usuario con este" + email));
  }

  @Override
  public User updateUser(User user, Long id) {
    User existingUser = getUserById(id);
    existingUser.setUserName(user.getUserName());
    return userRepository.save(existingUser);
  }

  @Override
  public void deleteUser(Long id) {
    User existingUser = getUserById(id);
    userRepository.delete(existingUser);
  }

  @Override
  public Iterable<User> getAllUser() {
    return userRepository.findAll();
  }

}
