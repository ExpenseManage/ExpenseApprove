package com.expenseApprove.expenseApprove.dao;

import com.expenseApprove.expenseApprove.model.User;


public interface UserDao {

    public void addUser(User user);
    public void addApprover(String userId, String approverId);
    public Long getSize();
    public boolean existsUser(String userId);
}
