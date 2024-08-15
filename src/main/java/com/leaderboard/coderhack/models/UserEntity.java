package com.leaderboard.coderhack.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.leaderboard.coderhack.dto.Badge;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "users")
@NoArgsConstructor
public class UserEntity {
    @Id
    private String userId;

    private String username;

    private int score;
    
    private List<Badge> badges = new ArrayList<>();
}
