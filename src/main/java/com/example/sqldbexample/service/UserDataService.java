package com.example.sqldbexample.service;

import com.example.sqldbexample.entity.UserData;

import java.util.List;

//interface to handle the entity UserData
public interface UserDataService {
    List<UserData> getUserData();
}
