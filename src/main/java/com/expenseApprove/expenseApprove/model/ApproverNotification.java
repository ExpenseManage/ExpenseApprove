package com.expenseApprove.expenseApprove.model;

import com.expenseApprove.expenseApprove.constants.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ApproverNotification {

    @JsonProperty("userId")
    public String userId;

    @JsonProperty("approverId")
    public String approverId;

    @JsonProperty("status")
    public Constants.approverNotification status;
}
