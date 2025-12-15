package com.iniisking.manycardsauthservice.repository;

import com.iniisking.manycardsauthservice.entity.RefreshToken;
import com.iniisking.manycardsauthservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, UUID> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByUser(User user);
    void deleteByExpiresAtBefore(LocalDateTime now);


}
