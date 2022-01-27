package com.example.MTGapiproject.Services;

import com.example.MTGapiproject.Entities.TestEntity;
import com.example.MTGapiproject.Payloads.requests.TestCreatePayload;
import com.example.MTGapiproject.Repositories.TestRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service // indicates service later
@Transactional // when something partially updates it deletes everything, no partial update
public class TestService {

    @Autowired // creates an instance that we can work with
    private TestRepository repository;

    public List<TestEntity> all() {
        return this.repository.findAll();
    }

    public TestEntity findById(Long id) {
        Optional<TestEntity> testEntity = this.repository.findById(id);
        if(testEntity.isEmpty()) {
            throw new Error(String.format("testEntity with id:%d does not exist", id));
        }
        return testEntity.get();
    }

    public TestEntity create(TestCreatePayload data) throws JsonProcessingException {
        TestEntity newTestEntity = new TestEntity();

        return this.repository.save(newTestEntity);
    }

}
