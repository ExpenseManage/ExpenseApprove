package com.expenseApprove.expenseApprove.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Approver {

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("approverId")
    private String approverId;
}
