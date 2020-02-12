package com.deboing.repositorytest;


import com.deboing.backend.persistence.domain.Plan;
import com.deboing.backend.persistence.domain.Role;
import com.deboing.backend.persistence.domain.User;
import com.deboing.backend.persistence.domain.UserRole;
import com.deboing.backend.persistence.repositories.PlanRepository;
import com.deboing.backend.persistence.repositories.RoleRepository;
import com.deboing.backend.persistence.repositories.UserRepository;
import com.deboing.enums.PlansEnum;
import com.deboing.enums.RolesEnum;
import com.deboing.utils.UsersUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RepoTest {



    @Autowired
    public UserRepository userRepository;

    @Autowired
    public PlanRepository planRepository;

    @Autowired
    public RoleRepository roleRepository;

    @Before
    public void init(){
        Assert.assertNotNull(userRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(planRepository);
    }


    @Test
    public void testCreateNewRole() throws Exception
    {
//          Role userROle = createRole(RolesEnum.BASIC);
//          User basicUser = UsersUtils.createBasicUser();
//          userROle.setUser(basicUser);
//          roleRepository.save(userROle);
//
//          Optional<Role> retrieveRole = roleRepository.findById(1);
//          Assert.assertNotNull(retrieveRole);
    }

    @Test
    public void testCreateNewPlan() throws Exception {
        Plan bacicPlan = createPlan(PlansEnum.BASIC);
        planRepository.save(bacicPlan);
        Optional<Plan> retrievePlan  = planRepository.findById(1);
        Assert.assertNotNull(retrievePlan);
    }


    @Test
    public void testCreateNewUser() throws Exception {
//        Plan bacicPlan = createPlan(PlansEnum.BASIC);
//        planRepository.save(bacicPlan);
//        User basicUser = UsersUtils.createBasicUser();
//        basicUser.setPlan(bacicPlan);
//        List<Role> roles = new ArrayList<>();
//        Role basicRole = createRole(RolesEnum.BASIC);
//        roles.add(basicRole);
//
//        for (Role role : roles){
//            roleRepository.save(role);
//        }
//        basicUser = userRepository.save(basicUser);
//        Assert.assertNotNull(basicUser);
//        Optional<User> newlyCreatedUser = userRepository.findById(basicUser.getUserId());
//        Assert.assertNotNull(newlyCreatedUser.get().getUserId() != 0);
//        userRepository.deleteById(basicUser.getUserId());
//
//        Optional<User> newlyDeletedUser = userRepository.findById(basicUser.getUserId());

    }
    public Plan createPlan(PlansEnum plansEnum){
        return new Plan(plansEnum);
    }

    public Role createRole(RolesEnum rolesEnum){
        return new Role(rolesEnum);

    }


}
