package com.expenseApprove.expenseApprove.dao;

import com.expenseApprove.expenseApprove.model.ApproverNotification;

public interface ApproverNotificationDao {

    public void addApproverNotification(ApproverNotification approverNotification);

    public void updateApproverNotification(ApproverNotification updateapproverNotificationRequest);
}
