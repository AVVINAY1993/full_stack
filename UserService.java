package com.user.userformdetails.service;

import com.user.userformdetails.entity.UserPojo;

import java.util.List;

public interface UserService {
    public List<UserPojo> getAllUsers();

    public UserPojo addUser(UserPojo userPojo);
}
