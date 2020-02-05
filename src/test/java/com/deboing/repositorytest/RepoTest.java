package com.deboing.repositorytest;


import com.deboing.backend.persistence.domain.Plan;
import com.deboing.backend.persistence.domain.Role;
import com.deboing.backend.persistence.domain.User;
import com.deboing.backend.persistence.domain.UserRole;
import com.deboing.backend.persistence.repositories.PlanRepository;
import com.deboing.backend.persistence.repositories.RoleRepository;
import com.deboing.backend.persistence.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

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
          Role userROle = createRole();
          roleRepository.save(userROle);
          Optional<Role> retrieveRole = roleRepository.findById(1);
          Assert.assertNotNull(retrieveRole);
    }

    @Test
    public void testCreateNewPlan() throws Exception {
        Plan bacicPlan = createPlan();
        planRepository.save(bacicPlan);
        Optional<Plan> retrievePlan  = planRepository.findById(1);
        Assert.assertNotNull(retrievePlan);
    }


    @Test
    public void testCreateNewUser() throws Exception {
        Plan bacicPlan = createPlan();
        planRepository.save(bacicPlan);
        User basicUser = createBasicUser();
        basicUser.setPlan(bacicPlan);

        Role basicRole = createRole();
        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRole.setUser(basicUser);
        userRole.setRole(basicRole);
        userRoles.add(userRole);

        basicUser.getUserRoles().addAll(userRoles);

        for (UserRole ur: userRoles){
            roleRepository.save(ur.getRole());
        }

        basicUser = userRepository.save(basicUser);
        Optional<User> newlyCreatedUser = userRepository.findById(basicUser.getUserId());
        Assert.assertNotNull(newlyCreatedUser);
        Assert.assertNotNull(newlyCreatedUser.get().getUserId() != 0);
        Assert.assertNotNull(newlyCreatedUser.get().getPlan());
        Assert.assertNotNull(newlyCreatedUser.get().getPlan().getPlanId());

        Set<UserRole> newlyCreatedUserRole = newlyCreatedUser.get().getUserRoles();
        for (UserRole ur: newlyCreatedUserRole){
            Assert.assertNotNull(ur.getRole());
            Assert.assertNotNull(ur.getRole().getId());
        }


    }
    public Plan createPlan(){
        Plan plan = new Plan();
        plan.setName("basic");
        plan.setPlanId(1);
        return plan;
    }

    public Role createRole(){
        Role role = new Role();
        role.setId(1);
        role.setName("ADMIN");
        return role;
    }

    public User createBasicUser(){
        User user = new User();
        user.setUsername("shekinah");
        user.setCountry("congo");
        user.setDescription("A future CEO");
        user.setEmail("shekinah@gmail.com");
        user.setFirstName("shekinah");
        user.setLastName("bakupa");
        user.setPassword("password");
        user.setPhoneNumber("2004562938");
        user.setProfileImage("https://blabla.images.com/basicuser");

        return user;
    }
}
