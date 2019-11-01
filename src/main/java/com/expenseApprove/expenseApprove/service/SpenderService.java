package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.model.User;

//NOTE: trying to use observer pattern
public interface SpenderService {

    public void addApprover(User approver);

    public void removeApprover(User approver);

    public  void notifyApprovers();
}
