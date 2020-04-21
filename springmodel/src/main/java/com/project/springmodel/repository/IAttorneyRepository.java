package com.project.springmodel.repository;

import com.project.springmodel.entity.Attorney;
import com.project.springmodel.entity.Person;
import org.springframework.data.repository.Repository;

public interface IAttorneyRepository extends Repository<Attorney, Long> {
    Iterable<Attorney> findAll();
    Attorney findByPerson(Person person);
}
