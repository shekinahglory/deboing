package com.deboing.backend.persistence.domain;

import com.deboing.enums.PlansEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Plan implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    @Column(name = "plan_id")
    private int planId;

    private String name;

    public Plan(){

    }

    public Plan(PlansEnum plansEnum){
        this.planId = plansEnum.getId();
        this.name = plansEnum.getPlanName();
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return planId == plan.planId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId);
    }


}
