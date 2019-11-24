package com.expenseApprove.expenseApprove.controller;

import com.expenseApprove.expenseApprove.model.ExpenseRequest;
import com.expenseApprove.expenseApprove.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class ExpenseRequestController {

    public ResponseEntity<Response> createExpenseRequest(@RequestBody ExpenseRequest expenseRequest){
        Response responseBody = new Response();
        responseBody.setMessage("created expense request");
        responseBody.setStatus(HttpStatus.OK);
        ResponseEntity response = new ResponseEntity<Response>(responseBody, HttpStatus.OK);
        return response;
    }
}
