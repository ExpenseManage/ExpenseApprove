package com.expenseApprove.expenseApprove.model;

import com.expenseApprove.expenseApprove.constants.Constants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseRequest {

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    //    TODO: add images to request
    @JsonProperty("images")
    private String images;

    @JsonProperty("status")
    private Constants.requestStatus status;

    @JsonProperty("type")
    private Constants.requestType type;

}
