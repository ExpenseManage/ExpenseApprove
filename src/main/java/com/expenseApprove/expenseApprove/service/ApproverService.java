package com.expenseApprove.expenseApprove.service;

import com.expenseApprove.expenseApprove.model.Approver;
import com.expenseApprove.expenseApprove.model.ApproverNotification;

public interface ApproverService {
    public void addApproverNotification(Approver approver);

    public void updateApproverNotification(ApproverNotification approver);
}
