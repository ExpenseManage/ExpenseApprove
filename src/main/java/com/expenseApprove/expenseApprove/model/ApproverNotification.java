package com.expenseApprove.expenseApprove.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApproverNotification {

    @JsonProperty("UserId")
    public String UserId;

    @JsonProperty("ApproverId")
    public String ApproverId;

    @JsonProperty("status")
    public Integer status;
}
