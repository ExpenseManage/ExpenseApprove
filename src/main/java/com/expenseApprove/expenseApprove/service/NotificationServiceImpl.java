package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.constants.Constants;
import com.expenseApprove.expenseApprove.dao.ApproverNotificationDaoImpl;
import com.expenseApprove.expenseApprove.model.Approver;
import com.expenseApprove.expenseApprove.model.ApproverNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NotificationServiceImpl  implements NotificationService{

    @Autowired
    ApproverNotificationDaoImpl approverNotificationDao;


    public void addApproverNotification(Approver approverRequest, Constants.approverNotification status){
        ApproverNotification approverNotification = new ApproverNotification();
        approverNotification.setUserId(approverRequest.getUserId());
        approverNotification.setApproverId(approverRequest.getApproverId());
        approverNotification.setStatus(status);
        approverNotificationDao.addApproverNotification(approverNotification);

    }

//    TODO: figure the layering and what all to be done in dao and in service
    public void updateApproverNotification(ApproverNotification updateNotificationRequest){
        approverNotificationDao.updateApproverNotification(updateNotificationRequest);

    }
}
