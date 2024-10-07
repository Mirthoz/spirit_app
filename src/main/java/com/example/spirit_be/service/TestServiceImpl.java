package com.example.spirit_be.service;

import com.example.spirit_be.TestService;
import com.example.spirit_be.model.Test;
import com.example.spirit_be.repository.SpiritRepository;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
  private final SpiritRepository spiritRepository;

  public TestServiceImpl(SpiritRepository spiritRepository) {
    this.spiritRepository = spiritRepository;
  }

  public int testRecordInDB(int counter){
    int t = counter;
    return spiritRepository.save(new Test(counter)).getCounter();
  }

  public String getAll() {
    return spiritRepository.findAll().toString();
  }
}
