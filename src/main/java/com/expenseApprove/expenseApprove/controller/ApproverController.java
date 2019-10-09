package com.expenseApprove.expenseApprove.controller;

import com.expenseApprove.expenseApprove.model.Approver;
import com.expenseApprove.expenseApprove.model.Response;
import com.expenseApprove.expenseApprove.service.ApproverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/approvers")
public class ApproverController {

    @Autowired
    ApproverServiceImpl approverService;

    @PostMapping("/approver")
    public ResponseEntity createApprover(@RequestBody Approver approverRequest){
//        TODO: handle cases where user, approver not present. Verify duplicate request at app end
        String userId = approverRequest.getUserId();
        String approverId = approverRequest.getApproverId();
        approverService.ApproverNotify(userId, approverId);
        Response responseBody = new Response();
        responseBody.setMessage("approver creation initiated");
        responseBody.setStatus(HttpStatus.OK);
        ResponseEntity response = new  ResponseEntity<>(responseBody,HttpStatus.OK);
        return response;
    }

}
