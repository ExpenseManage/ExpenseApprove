package com.expenseApprove.expenseApprove.dao;

import com.expenseApprove.expenseApprove.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public void addUser(User user){
        mongoTemplate.insert(user);
    }

    public Long getSize(){
        Query query = new Query();
        List data = mongoTemplate.find(query,User.class);
        return mongoTemplate.count(query, User.class);
    }

    public void addApprover(String userId, String approverId){
//        TODO: add approver add logic
    }
}
