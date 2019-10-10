package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.dao.UserDaoImpl;
import com.expenseApprove.expenseApprove.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDaoImpl userDao;

    public void addUser(User userModel){
//        TODO: add password encryption and validations
        userDao.addUser(userModel);
    }
}
