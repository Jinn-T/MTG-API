package com.example.MTGapiproject.Repositories;


import com.example.MTGapiproject.Entities.testEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// it is an interface because we need to extend jparepository - to access other methods
// repository - where we add methods to interact with the database
public interface testRepository extends JpaRepository<testEntity, Long> { // integer that can hold more data

    // Optional - A container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
    Optional<testEntity> findById(long id);
    // List - access list methods < field in database essentially > "List of type testEntity"
    List<testEntity> findByName(String name);
    List<testEntity> findByPower(Integer power);
}
