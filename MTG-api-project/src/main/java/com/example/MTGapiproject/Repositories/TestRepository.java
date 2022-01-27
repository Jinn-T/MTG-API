package com.example.MTGapiproject.Repositories;


import com.example.MTGapiproject.Entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// it is an interface because we need to extend jparepository - to access other methods
// repository - where we add methods to interact with the database
public interface TestRepository extends JpaRepository<TestEntity, Long> { // integer that can hold more data

    // Optional - A container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
    Optional<TestEntity> findById(long id);
    // List - access list methods < field in database essentially > "List of type testEntity"
    List<TestEntity> findByName(String name);
    List<TestEntity> findByPower(Integer power);
}
