package ru.itis.service.test.general.api;

import ru.itis.dto.stats.CompletedTestStats;
import ru.itis.dto.stats.CreatedTestStats;

import java.util.List;
import java.util.UUID;

public interface GetUserStatsService {
    int getTakeTestsCount(UUID userId);
    int getCreateTestsCount(UUID userId);
    List<CreatedTestStats> getCreatedTestStats(UUID userId);
    List<CompletedTestStats> getUsersScoreCompletedAtByUserId(UUID userId);

}
