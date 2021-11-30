package com.timothy;

import com.timothy.dao.UserDAO;
import com.timothy.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestUserDAO {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void testFindAll(){
        List<User> users = userDAO.selectList(null);
        users.forEach(user -> System.out.println("user = "+user));

    }

}
