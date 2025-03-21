package com.AgroMX.app.service;

import com.AgroMX.app.model.User;

import java.util.Optional;

public interface UserService {

  User createUser(User user);

  User getUserById(Long id);

  Optional<User> getUserByEmail(String email);

  // User updateUser(Customer customer, Long id);
  User updateUser(User user, Long id);

  void deleteUser(Long id);

  Iterable<User> getAllUser();
}
