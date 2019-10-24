package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.constants.Constants;
import com.expenseApprove.expenseApprove.model.Approver;
import com.expenseApprove.expenseApprove.model.ApproverNotification;

public interface NotificationService {
    public void addApproverNotification(Approver approverRequest, Constants.approverNotification status);

    public void updateApproverNotification(ApproverNotification approverRequest);
}
