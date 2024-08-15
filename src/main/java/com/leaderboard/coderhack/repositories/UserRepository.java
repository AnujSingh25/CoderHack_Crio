package com.leaderboard.coderhack.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leaderboard.coderhack.models.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String>{
    Optional<UserEntity> findByUserId(String userId);
} 
