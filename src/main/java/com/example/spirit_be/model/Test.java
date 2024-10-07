package com.example.spirit_be.model;

import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "test")
public class Test {
  @Id
  private String id;
  int counter;

  public Test(){}

  public Test(int counter) {
    this.counter = counter;
  }

  public String getId() {
    return id;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Test test = (Test) o;
    return counter == test.counter && Objects.equals(id, test.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, counter);
  }

  @Override
  public String toString() {
    return "Test{" +
        "id='" + id + '\'' +
        ", counter=" + counter +
        '}';
  }
}
