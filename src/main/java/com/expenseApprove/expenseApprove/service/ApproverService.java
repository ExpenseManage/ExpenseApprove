package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.model.User;

import java.util.List;

public interface ApproverService {
//    TODO: add spender object in approver to avoid parameters in update
 void update();
 List<User> getApprovers(String userId);

}
