package ru.itis.dto.stats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class UserIdResultCompletedAt {
    private UUID userId;
    private int score;
    private LocalDateTime completedAt;
}
