package com.project.springmodel.repository;

import com.project.springmodel.entity.Attorney;
import com.project.springmodel.entity.Student;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface IStudentRepository extends Repository<Student, Long> {
    List<Student> findByAttorney(Attorney attorney);
}
