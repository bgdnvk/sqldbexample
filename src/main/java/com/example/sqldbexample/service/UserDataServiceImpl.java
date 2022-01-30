package com.example.sqldbexample.service;

import com.example.sqldbexample.entity.UserData;
import com.example.sqldbexample.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService{

    //get the repository bean
    @Autowired
    UserDataRepository userDataRepository;

    //we use the repository bean to get access to all the methods
    //like findAll
    @Override
    public List<UserData> getUserData() {
        return userDataRepository.findAll();
    }
}
