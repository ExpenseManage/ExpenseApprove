package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.model.ExpenseRequest;

public class ExpenseRequestServiceImpl implements RequestService {

    public void notifyApprovers(ExpenseRequest expenseRequest){
        String userId = expenseRequest.getUser();

    }

    private void sendNotification(){

    }
}
