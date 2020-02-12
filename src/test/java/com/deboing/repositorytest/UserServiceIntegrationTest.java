package com.deboing.repositorytest;


import com.deboing.backend.persistence.domain.Role;
import com.deboing.backend.persistence.domain.User;
import com.deboing.backend.persistence.domain.UserRole;
import com.deboing.backend.service.UserService;
import com.deboing.enums.PlansEnum;
import com.deboing.enums.RolesEnum;
import com.deboing.utils.UsersUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCreateNewUser() throws Exception{
//        Set<UserRole> userRoles = new HashSet<>();
//        User basicUser = UsersUtils.createBasicUser();
//        Role basicRole = new Role(RolesEnum.BASIC);
////        Set<UserRole> userRoles = new HashSet<>();
//        UserRole userRole = new UserRole(basicUser, basicRole);
//        userRoles.add(userRole);
//       userRoles.add(new UserRole(basicUser, new Role(RolesEnum.PRO)));

//        User user = userService.createUser(basicUser, PlansEnum.BASIC, userRoles);
//        Assert.assertNotNull(user);
//        Assert.assertNotNull(user.getUserId());
    }

}
