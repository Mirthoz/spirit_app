package com.example.spirit_be.repository;

import com.example.spirit_be.model.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpiritRepository extends MongoRepository<Test, String> {}