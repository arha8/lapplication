package org.example.lapplication.repository;

import org.example.lapplication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByUsername(String username);
}
