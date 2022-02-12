package com.puzikov.instagramClone.repository;

import com.puzikov.instagramClone.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface
UserRepository extends JpaRepository<User, UUID> {
    User findUserByNickname(String nickname);
}
