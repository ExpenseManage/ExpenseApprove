package com.expenseApprove.expenseApprove.controller;


import com.expenseApprove.expenseApprove.model.Response;
import com.expenseApprove.expenseApprove.model.User;
import com.expenseApprove.expenseApprove.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO : add logging, validations and handle exceptions
//TODO: add autoincrement for ids


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody User user){
//        TODO: add id in response
        userService.addUser(user);
        Response responseBody = new Response();
        responseBody.setMessage("added user");
        responseBody.setStatus(HttpStatus.OK);
        ResponseEntity response = new  ResponseEntity<>(responseBody,HttpStatus.OK);
        return response;
    }

}
