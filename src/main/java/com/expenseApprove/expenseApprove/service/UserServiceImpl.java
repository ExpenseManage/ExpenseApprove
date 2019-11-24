package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.dao.UserDaoImpl;
import com.expenseApprove.expenseApprove.model.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private
    UserDaoImpl userDao;

    public void addUser(User userModel) {
//        TODO: add password encryption and validations
        userDao.addUser(userModel);
    }

<<<<<<< Updated upstream
    public void addApprover(ApproverRequest approverRequest) {
        String userId = approverRequest.getUserId();
        String approverId = approverRequest.getApproverId();
        if (userDao.existsUser(userId)) {
            userDao.addApprover(userId, approverId);
        }
    }

    public void removeApprover(User approver) {

    }

    public void notifyApprovers() {

    }


=======
>>>>>>> Stashed changes
}
