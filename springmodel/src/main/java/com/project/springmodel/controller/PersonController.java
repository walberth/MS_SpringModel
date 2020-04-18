package com.project.springmodel.controller;

import com.project.springmodel.model.Person;
import com.project.springmodel.service.IPersonService;
import com.project.springmodel.transversal.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PersonController {
    private IPersonService personService;

    @Autowired
    public PersonController(IPersonService personService){
        this.personService = personService;
    }

    @GetMapping("/api/person")
    public Response<List<Person>> findByFatherLastName(@RequestParam(value="fatherLastName") String fatherLastName) {
        return this.personService.findByFatherLastName(fatherLastName);
    }
}
