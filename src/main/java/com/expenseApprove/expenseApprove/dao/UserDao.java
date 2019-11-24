package com.expenseApprove.expenseApprove.dao;

import com.expenseApprove.expenseApprove.model.Data.User;


public interface UserDao {

    public void addUser(User user);

    public Long getSize();

    public boolean existsUser(String userId);
}
