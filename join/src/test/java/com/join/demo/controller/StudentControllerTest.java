package com.join.demo.controller;

import com.join.demo.AbstractTest;
import com.join.demo.entity.Student;
import com.join.demo.repository.StudentRepository;
import com.join.demo.service.StudentService;
import io.swagger.models.auth.In;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentControllerTest extends AbstractTest {
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @InjectMocks
    StudentController studentController;
    @Mock
    StudentService studentService;
    private Object Student;

    @Mock
    StudentRepository studentRepository;

    @Test
    public void testSaveAllStudents() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        when(studentService.saveAllStudent(any(Student.class))).thenReturn(student);
        Student responseStudent = studentController.saveAllStudents(student);
        assertThat(responseStudent.getName()).isEqualTo("Sonja");

    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student();
        student.setId(1);
        student.setName("sonja");
        student.setAddress(student.getAddress());
        student.setUniversity("fshn");
        student.setRollNumber("123");
        Optional<Student> studentOptional = Optional.of(student);
        Student student1 = studentOptional.get();
        // providing knowledge
        when(studentRepository.findById(any(Integer.class))).thenReturn(studentOptional);
        ResponseEntity r = new ResponseEntity(HttpStatus.OK);
        when(studentRepository.save(eq(student1))).thenReturn(student);
        ResponseEntity<com.join.demo.entity.Student> student2 = studentController.updateStudent(1, student);

        assertThat(student2.getBody()).isNotNull();
    }


    @Test
    public void deleteStudentById() {
        Integer id = 1;
        this.studentService.delete(id);
        Student student = new Student();
        String student1 = studentController.deleteById(1);
        assertThat(student.getId()).isNotNull();
    }

    @Test
    public void getStudentById() {
        Integer id = 1;
        this.studentService.get(id);
        Student student = new Student();
        com.join.demo.entity.Student student1 = studentController.getStudent(1);
        assertThat(student.getId()).isNotNull();
    }

}




