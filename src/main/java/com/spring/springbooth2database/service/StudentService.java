package com.spring.springbooth2database.service;

import com.spring.springbooth2database.model.Student;
import com.spring.springbooth2database.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    public Student getStudentById(String id){
        return studentRepository.findById(id).get();
    }

    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

    public void delete(String id){
        studentRepository.deleteById(id);
    }
}
