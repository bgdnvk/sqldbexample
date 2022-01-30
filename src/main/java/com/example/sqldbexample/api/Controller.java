package com.example.sqldbexample.api;

import com.example.sqldbexample.entity.UserData;
import com.example.sqldbexample.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController annotation will make this class the controller
//meaning that it's listening to htttp://localhost:8080 calls
//and replying with whatever endpoints you have made
@RestController
//localhost:8080/api/v1
@RequestMapping("api/v1")
public class Controller {

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/getdata")
    public List<UserData> getData(){
        return userDataService.getUserData();
    }
}
