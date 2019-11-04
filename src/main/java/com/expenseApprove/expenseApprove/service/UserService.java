package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.model.ApproverRequest;
import com.expenseApprove.expenseApprove.model.User;

public interface UserService {
    public void addUser(User userModel);

    public void addApprover(ApproverRequest approverRequest);

    public void removeApprover(User approver);

    public void notifyApprovers();
}
