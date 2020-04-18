package com.project.springmodel.repository;

import com.project.springmodel.model.Person;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface IPersonRepository extends Repository<Person, Long> {
    List<Person> findByFatherLastName(String fatherLastName);
}
