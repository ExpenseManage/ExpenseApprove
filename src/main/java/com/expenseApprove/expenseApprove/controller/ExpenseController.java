package com.expenseApprove.expenseApprove.controller;

import com.expenseApprove.expenseApprove.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ExpenseController {

    @GetMapping("/expenses/<userId>")
    public ResponseEntity<Response> getExpenses(@RequestParam String userId){
//        TODO: return all expenses
    }
}
