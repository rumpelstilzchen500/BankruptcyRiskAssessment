package com.api.BankruptcyRiskAssessment.repository;


import com.api.BankruptcyRiskAssessment.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByLogin(String login);
}
