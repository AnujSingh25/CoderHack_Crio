package com.leaderboard.coderhack.repositoryServices;

import java.util.List;

import com.leaderboard.coderhack.dto.User;
import com.leaderboard.coderhack.exceptions.UserNotFoundException;

public interface UserRepositoryService {
    User createUser(String username);

    User updateScore(String userId, int score) throws UserNotFoundException;

    User findUser(String userId) throws UserNotFoundException;

    List<User> findAllUsers();

    void deleteUser(String userId) throws UserNotFoundException;
}
