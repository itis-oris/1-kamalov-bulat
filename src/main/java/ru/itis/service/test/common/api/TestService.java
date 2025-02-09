package ru.itis.service.test.common.api;

import ru.itis.model.Test;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

public interface TestService {

    Test findById(UUID uuid);

    UUID save(Test test, Connection connection);

    boolean deleteById(UUID uuid);

    List<Test> findAll();

    List<Test> findByCategory(String category);

    int countOfCreatedTestsByUser(UUID userId);

    List<UUID> findCreatedTestsByUser(UUID userId);


}
