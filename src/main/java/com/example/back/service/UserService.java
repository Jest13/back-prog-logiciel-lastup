package com.example.back.service;

import com.example.back.repository.UserRepository;
import com.example.back.exception.UserNotFoundException;
import com.example.back.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
 @Service
 public class UserService {

     private final UserRepository userRepository;

     @Autowired
     public UserService(UserRepository userRepository) {

         this.userRepository = userRepository;
     }

     public User addUser(User user){
         user.setUserCode(UUID.randomUUID().toString());
         return userRepository.save(user);
     }

     public List<User> findAllUsers() {
         return userRepository.findAll();
     }

     public User updateUser(User user) {
         return userRepository.save(user);
     }

     public User findUserById(Long id){
         return (User) userRepository.findUserById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));

     }
     public void deleteUser(Long id){
         userRepository.deleteUserById(id);
     }

 }
