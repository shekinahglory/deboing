package com.deboing.backend.persistence.repositories;

import com.deboing.backend.persistence.domain.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}
