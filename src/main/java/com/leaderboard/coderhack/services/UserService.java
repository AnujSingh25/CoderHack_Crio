package com.leaderboard.coderhack.services;

import java.util.List;

import com.leaderboard.coderhack.dto.User;
import com.leaderboard.coderhack.exceptions.UserNotFoundException;

public interface UserService {
    User registerUser(String username);

    User updateScore(String userId, int score) throws UserNotFoundException;

    User findUser(String userId) throws UserNotFoundException;

    List<User> findAllUsers();

    void deregisterUser(String userId) throws UserNotFoundException;
}