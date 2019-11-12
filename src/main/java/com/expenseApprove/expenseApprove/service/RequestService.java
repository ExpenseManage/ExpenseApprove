package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.model.ExpenseRequest;

public interface RequestService {

    void notifyApprovers(ExpenseRequest expenseRequest);

}
