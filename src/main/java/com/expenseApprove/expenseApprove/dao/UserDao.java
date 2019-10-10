package com.expenseApprove.expenseApprove.dao;

import com.expenseApprove.expenseApprove.model.User;


public interface UserDao {

    public void addUser(User user);
    public Long getSize();
}
