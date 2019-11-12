package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.dao.UserDao;
import com.expenseApprove.expenseApprove.dao.UserDaoImpl;
import com.expenseApprove.expenseApprove.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ApproverServiceImpl implements ApproverService {

    @Autowired
    UserDaoImpl userDao;

    public void update() {

    }

    public List<User> getApprovers(String userId){
        User user = userDao.getUserById(userId);
        List<String> approverIds = user.getApprovers();
        List<User> approvers = null;
        for(String approverId: approverIds){
            User approverUser = userDao.getUserById(approverId);
            approvers.add(approverUser);
        }
        return approvers;
    }
}
