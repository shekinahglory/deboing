package com.deboing.backend.persistence.repositories;

import com.deboing.backend.persistence.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


    public User findByUsername(String username);
}
