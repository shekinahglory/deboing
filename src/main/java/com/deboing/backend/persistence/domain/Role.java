package com.deboing.backend.persistence.domain;

import com.deboing.enums.RolesEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Role implements Serializable {



    private static final long serialVersionUID = 1l;

    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UserRole> userRoles = new HashSet<>();

    public Role(){}

    public Role(RolesEnum rolesEnum){
        this.id = rolesEnum.getId();
        this.name = rolesEnum.getRoleName();
    }

    public int getId() {
        return id;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
