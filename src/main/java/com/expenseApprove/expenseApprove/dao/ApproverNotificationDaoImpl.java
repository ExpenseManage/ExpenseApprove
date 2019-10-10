package com.expenseApprove.expenseApprove.dao;

import com.expenseApprove.expenseApprove.model.ApproverNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class ApproverNotificationDaoImpl  implements ApproverNotificationDao{

    @Autowired
    MongoTemplate mongoTemplate;

    public void addApproverNotification(ApproverNotification approverNotification){
        mongoTemplate.insert(approverNotification);
    }

    public void updateApproverNotification(ApproverNotification approverNotificationRequest){
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(approverNotificationRequest.getUserId()).
                and("approverId").is(approverNotificationRequest.getApproverId()));
        ApproverNotification approverNotification = mongoTemplate.findOne(query, ApproverNotification.class);
        Update update = new Update();
        update.set("status", approverNotificationRequest.getStatus());
        mongoTemplate.updateFirst(query, update, ApproverNotification.class);
    }

    public ApproverNotification getApproverRequestNotification(String userId, String approverId){
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId).and("approverId").is(approverId));
        ApproverNotification approverNotificationRequest = mongoTemplate.findOne(query, ApproverNotification.class);
        return approverNotificationRequest;
    }

}
