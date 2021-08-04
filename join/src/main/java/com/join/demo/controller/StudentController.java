package com.join.demo.controller;


import com.join.demo.entity.Student;
import com.join.demo.repository.StudentRepository;
import com.join.demo.service.StudentService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/saveall", method = RequestMethod.POST)
    @ResponseBody
    public Student saveAllStudents(@RequestBody Student student) {
        Student studentResponse = (Student) studentService.saveAllStudent(student);
        return studentResponse;
    }

    @RequestMapping(value = "/address/{city}", method = RequestMethod.GET)
    @ResponseBody
    public List<Student> findByAddressCity(@PathVariable String city) {

        List<Student> studentResponse = (List<Student>) studentService.findByAddressCity(city);
        return studentResponse;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public long countEntities() {
        long count = studentService.getCountOfEntities();
        return count;
    }

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    @ResponseBody
    public long sumRollNumbers() {
        long sum = studentService.sumRollNumbers();
        return sum;
    }


    @PostMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student) {
        Optional<Student> studentOptional = studentRepository.findById((int) id);
        if (studentOptional.isPresent()) {
            Student student1 = studentOptional.get();
            student1.setName(student.getName());
            student1.setAddress(student.getAddress());
            student1.setRollNumber(student.getRollNumber());
            student1.setUniversity(student.getUniversity());
            return new ResponseEntity<>(studentRepository.save(student1), HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {
        Student getResponse = studentService.get(id);
        return getResponse;
    }


    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id) {
       return studentService.delete(id);
            }

    @RequestMapping(value = "/avg", method = RequestMethod.GET)
    @ResponseBody
    public Double avgRollNumbers() {
        double avg = studentService.avgRollNumbers();
        return avg;
    }


    @RequestMapping(value = "/studentCount", method = RequestMethod.GET)
    @ResponseBody
    public List findStudentCount() {
        List student = studentService.findStudentCount();
        return student;
    }


    @RequestMapping(value = "/join", method = RequestMethod.GET)
    @ResponseBody
    public List join() {
        return studentService.join();
    }

    @RequestMapping(value = "/rightJoin", method = RequestMethod.GET)
    @ResponseBody
    public List rightJoin() {
        return studentService.rightJoin();
    }

    @RequestMapping(value = "/crossJoin", method = RequestMethod.GET)
    @ResponseBody
    public List crossJoin() {
        return studentService.crossJoin();
    }
}
