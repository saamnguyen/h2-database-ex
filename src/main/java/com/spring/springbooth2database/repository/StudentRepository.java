package com.spring.springbooth2database.repository;

import com.spring.springbooth2database.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {
}
