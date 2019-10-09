package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.controller.Constants;

public interface NotificationService {
    public void addApproverNotification(String UserId, String ApproverId, Constants.approverNotification status);

    public void updateApproverNotification(String UserId, String ApproverId, Constants.approverNotification status);
}
