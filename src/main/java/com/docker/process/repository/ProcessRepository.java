package com.docker.process.repository;

import com.docker.process.document.Process;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends MongoRepository<Process,String> {
}
