package com.user.userformdetails.service;

import com.user.userformdetails.entity.UserPojo;
import com.user.userformdetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
@Autowired
 private UserRepository userRepository;

    @Override
    public List<UserPojo> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserPojo addUser(UserPojo userPojo) {
        return userRepository.save(userPojo);

    }

}
