package com.join.demo.service;


import com.join.demo.entity.Student;
import com.join.demo.repository.StudentRepository;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {
    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService = new StudentServiceImpl();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void saveStudent() {
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.saveAllStudent(student);
        verify(studentRepository, times(1)).saveAndFlush(student);
    }

    @Test
    public void updateStudent() {
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.update(student);
        verify(studentRepository, times(1)).save(student);
    }

    @Test
    public void deleteStudent() {
        Integer id = 1;
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.delete(id);
        verify(studentRepository, times(1)).deleteById(id);
    }

    @Test
    public void sumRollNumbers() {
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.sumRollNumbers();
        verify(studentRepository, times(1)).sumRollNumbers();
    }

    @Test
    public void getCountOfEntities() {
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.getCountOfEntities();
        verify(studentRepository, times(1)).count();
    }

    @Test
    public void avgRollNumbers() {
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.avgRollNumbers();
        verify(studentRepository, times(1)).avgRollNumbers();
    }

    @Test
    public void validId() {
        Integer id = 1;
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.validId(id);
        verify(studentRepository, times(1)).validId(id);
    }
    @Test
    public void findById() {
        Integer id = 1;
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.findById(id);

    }
    @Test
    public void findByAddress() {
        Integer id = 1;
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        studentService.delete(id);
        verify(studentRepository, times(1)).deleteById(id);
    }
}