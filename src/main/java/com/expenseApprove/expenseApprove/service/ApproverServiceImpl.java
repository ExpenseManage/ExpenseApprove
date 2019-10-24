package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.constants.Constants;
import com.expenseApprove.expenseApprove.model.Approver;
import com.expenseApprove.expenseApprove.model.ApproverNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApproverServiceImpl implements ApproverService {

    @Autowired
    NotificationService notificationService;

    public void addApproverNotification(Approver approverRequest){
//   TODO: push notification logic here. then add the status to notification document.
        notificationService.addApproverNotification(approverRequest,  Constants.approverNotification.PENDING);
    }

    public void updateApproverNotification(ApproverNotification approverRequest){
        notificationService.updateApproverNotification(approverRequest);
    }
}
