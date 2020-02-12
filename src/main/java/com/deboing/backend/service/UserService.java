package com.deboing.backend.service;


import com.deboing.backend.persistence.domain.Plan;
import com.deboing.backend.persistence.domain.Role;
import com.deboing.backend.persistence.domain.User;
import com.deboing.backend.persistence.domain.UserRole;
import com.deboing.backend.persistence.repositories.PlanRepository;
import com.deboing.backend.persistence.repositories.RoleRepository;
import com.deboing.backend.persistence.repositories.UserRepository;
import com.deboing.enums.PlansEnum;
import com.deboing.enums.RolesEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public User createUser(User user, PlansEnum plansEnum, RolesEnum rolesEnum){
        Plan plan = new Plan(plansEnum);

        //It makes sure the plans exist in the database
        if(!planRepository.existsById(plansEnum.getId())){
            plan = planRepository.save(plan);
        }
        String encryptedPassword = passwordEncoder.encode(user.getPassword());
        user.setPlan(plan);
        user.setPassword(encryptedPassword);
        Role userRole = new Role();
        userRole.setUser(user);
        userRole.setId(rolesEnum.getId());
        userRole.setName(rolesEnum.getRoleName());
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        User createdUser = userRepository.save(user);
        for (Role role : roles){
            roleRepository.save(role);
        }
      return createdUser;

    }
}
