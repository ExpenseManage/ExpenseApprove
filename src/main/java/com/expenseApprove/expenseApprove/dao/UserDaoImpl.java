package com.expenseApprove.expenseApprove.dao;

import com.expenseApprove.expenseApprove.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public void addUser(User user) {
        mongoTemplate.insert(user);
    }

    //    TODO: add mongo exception
    public Long getSize() {
        Query query = new Query();
        List data = mongoTemplate.find(query, User.class);
        return mongoTemplate.count(query, User.class);
    }

    public void addApprover(String userId, String approverId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(userId));
        User user = mongoTemplate.findOne(query, User.class);
        Update update = new Update();
        assert user != null;
        List approverList = new ArrayList();
        if (user.getApprovers() == null) {
            approverList.add(approverId);
        } else {
            approverList = user.getApprovers();
            approverList.add(approverId);
        }
        update.set("approvers", approverList);
        mongoTemplate.updateFirst(query, update, User.class);

    }

    public User getUserById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }

    public boolean existsUser(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(userId));
        User user = mongoTemplate.findOne(query, User.class);
        return user != null;
    }
}
