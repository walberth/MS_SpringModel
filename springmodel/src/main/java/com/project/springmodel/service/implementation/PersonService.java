package com.project.springmodel.service.implementation;

import com.project.springmodel.model.Person;
import com.project.springmodel.repository.IPersonRepository;
import com.project.springmodel.service.IPersonService;
import com.project.springmodel.transversal.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("PersonService")
public class PersonService implements IPersonService {
    private IPersonRepository personRepository;

    @Autowired
    public PersonService(IPersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public Response<List<Person>> findByFatherLastName(String fatherLastName) {
        Response<List<Person>> response = new Response<>();

        if(fatherLastName.isEmpty()) {
            response.setMessage("Didn't parameters for search");

            return response;
        }

        List<Person> persons = this.personRepository.findByFatherLastName(fatherLastName);

        if(persons.isEmpty()) {
            response.setMessage("Can't find results");

            return response;
        }

        response.setData(persons);
        response.setIsWarning(false);

        return response;
    }
}
