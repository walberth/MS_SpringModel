package com.project.springmodel.service.implementation;

import com.project.springmodel.entity.Attorney;
import com.project.springmodel.entity.Person;
import com.project.springmodel.entity.Student;
import com.project.springmodel.model.AttorneyDto;
import com.project.springmodel.model.PersonDto;
import com.project.springmodel.model.StudentDto;
import com.project.springmodel.repository.IAttorneyRepository;
import com.project.springmodel.repository.IPersonRepository;
import com.project.springmodel.repository.IStudentRepository;
import com.project.springmodel.service.IPersonService;
import com.project.springmodel.transversal.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("PersonService")
public class PersonService implements IPersonService {
    private final IPersonRepository personRepository;
    private final IAttorneyRepository attorneyRepository;
    private final IStudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PersonService(IPersonRepository personRepository, IAttorneyRepository attorneyRepository, IStudentRepository studentRepository, ModelMapper modelMapper){
        this.personRepository = personRepository;
        this.attorneyRepository = attorneyRepository;
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Response<List<Person>> findByFatherLastName(String fatherLastName) {
        Response<List<Person>> response = new Response<>();

        if(fatherLastName.isEmpty()) {
            response.setMessage("Didn't parameters for search");

            return response;
        }

        //int test = 1/ 0;

        Person personEntity= this.personRepository.findByFirstName("Gualberto");

        PersonDto person = modelMapper.map(personEntity, PersonDto.class);

        Attorney attorneyEntity = this.attorneyRepository.findByPerson(personEntity);

        AttorneyDto attorney = modelMapper.map(attorneyEntity, AttorneyDto.class);

        List<Student> studentEntityList = this.studentRepository.findByAttorney(attorneyEntity);

        List<StudentDto> students = new ArrayList<>();

        for (final Student studentEntity: studentEntityList) {
            students.add(modelMapper.map(studentEntity, StudentDto.class));
        }

        attorney.setStudents(students);
        attorney.setPerson(person);

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
