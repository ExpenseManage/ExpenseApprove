package com.expenseApprove.expenseApprove.model.business;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response<T> {

    @JsonProperty("id")
    private String id;

    @JsonProperty("message")
    private  String message;

    @JsonProperty("status")
    private HttpStatus status;

    @JsonProperty("body")
    private List<T> body;
}
