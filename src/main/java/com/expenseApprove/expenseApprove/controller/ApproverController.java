package com.expenseApprove.expenseApprove.controller;

import com.expenseApprove.expenseApprove.model.ApproverRequest;
import com.expenseApprove.expenseApprove.model.Response;
import com.expenseApprove.expenseApprove.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO: right now allowing user to add anyone as approver, will have to have appprover permission later

@RestController
@RequestMapping("/api/approvers")
public class  ApproverController{

    @Autowired
    UserServiceImpl userService;


    @PostMapping("/approver")
    public ResponseEntity<Response> createApprover(@RequestBody ApproverRequest approverRequest){
//        TODO: add id in response
        userService.addApprover(approverRequest);
        Response responseBody = new Response();
        responseBody.setMessage("added approver");
        responseBody.setStatus(HttpStatus.OK);
        ResponseEntity response = new  ResponseEntity<Response>(responseBody,HttpStatus.OK);
        return response;
    }

}

