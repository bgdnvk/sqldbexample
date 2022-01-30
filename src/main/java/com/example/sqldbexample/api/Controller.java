package com.example.sqldbexample.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController annotation will make this class the controller
//meaning that it's listening to htttp://localhost:8080 calls
//and replying with whatever endpoints you have made
@RestController
//localhost:8080/api/v1
@RequestMapping("api/v1")
public class Controller {
}
