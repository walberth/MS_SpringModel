package com.project.springmodel.service;

import com.project.springmodel.model.Person;
import com.project.springmodel.transversal.Response;
import java.util.List;

public interface IPersonService {
    Response<List<Person>> findByFatherLastName(String fatherLastName);
}
