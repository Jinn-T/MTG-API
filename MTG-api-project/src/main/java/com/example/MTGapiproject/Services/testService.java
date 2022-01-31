package com.example.MTGapiproject.Services;

import com.example.MTGapiproject.Entities.testEntity;
import com.example.MTGapiproject.Payloads.requests.testCreatePayload;
import com.example.MTGapiproject.Repositories.testRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service // indicates service later
@Transactional // when something partially updates it deletes everything, no partial update
public class testService {

    @Autowired // creates an instance that we can work with
    private testRepository repository;

    public List<testEntity> all() {return this.repository.findAll();}

    public testEntity findById(Long id) {
        Optional<testEntity> testEntity = this.repository.findById(id);
        if(testEntity.isEmpty()) {
            throw new Error(String.format("testEntity with id:%d does not exist", id));
        }
        return testEntity.get();
    }

    public void create(testCreatePayload test) {
        testEntity newTestEntity = new testEntity(test.getName(), test.getPower());

        repository.save(newTestEntity);
    }

}
