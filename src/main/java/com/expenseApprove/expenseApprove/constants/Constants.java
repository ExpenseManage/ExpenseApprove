package com.expenseApprove.expenseApprove.constants;

public class Constants {

    public enum requestStatus {
        //        pending: 0, accepted: 1, rejected:2, failure:3
        PENDING, ACCEPTED, REJECTED, FAILURE;
    }

    public enum requestType {
        APPROVER, EXPENSE;
    }
}


