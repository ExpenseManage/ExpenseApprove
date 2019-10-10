package com.expenseApprove.expenseApprove.controller;

import com.expenseApprove.expenseApprove.model.Approver;
import com.expenseApprove.expenseApprove.model.ApproverNotification;
import com.expenseApprove.expenseApprove.model.Response;
import com.expenseApprove.expenseApprove.service.ApproverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/approvers")
public class ApproverController {

    @Autowired
    ApproverServiceImpl approverService;

    @PostMapping("/approver")
    public ResponseEntity createApprover(@RequestBody Approver approverRequest){
//        TODO: handle cases where user, approver not present. Verify duplicate request at app end
        approverService.addApproverNotification(approverRequest);
        Response responseBody = new Response();
        responseBody.setMessage("approver creation initiated");
        responseBody.setStatus(HttpStatus.OK);
        ResponseEntity response = new  ResponseEntity<>(responseBody,HttpStatus.OK);
        return response;

    }

    @PutMapping("/approver")
    public ResponseEntity updateApprover(@RequestBody ApproverNotification approverRequest){
        approverService.updateApproverNotification(approverRequest);
        Response responseBody = new Response();
        responseBody.setMessage("approver notification updated");
        responseBody.setStatus(HttpStatus.OK);
        ResponseEntity response = new  ResponseEntity<>(responseBody,HttpStatus.OK);
        return response;
    }


}
