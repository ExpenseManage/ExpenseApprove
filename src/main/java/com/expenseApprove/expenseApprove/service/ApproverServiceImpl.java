package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.controller.Constants;
import org.springframework.beans.factory.annotation.Autowired;

public class ApproverServiceImpl implements ApproverService {

    @Autowired
    NotificationService notificationService;

    public void ApproverNotify(String UserId, String ApproverId){
//   TODO: push notification logic here. then add the status to notification document.
        notificationService.addApproverNotification(UserId, ApproverId,  Constants.approverNotification.PENDING);
    }
}
