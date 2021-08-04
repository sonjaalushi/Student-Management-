package com.join.demo.service;

import java.util.List;
import java.util.Optional;

import com.join.demo.dto.JoinDto;
import com.join.demo.entity.Student;
import com.join.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Student saveAllStudent(Student student) {
        Student response = (Student) studentRepository.saveAndFlush(student);
        return response;
    }

    @Transactional
    public List<Student> findByAddressCity(String city) {
        List<Student> response = (List<Student>) studentRepository.findByAddressCity(city);
        return response;
    }


    @Transactional(readOnly = true)
    public long getCountOfEntities() {
        long count = studentRepository.count();
        return count;
    }

    @Transactional
    public Long sumRollNumbers() {
        return studentRepository.sumRollNumbers();
    }

    @Transactional
    public Student update(Student student) {
        Student updateResponse = studentRepository.save(student);
        return updateResponse;
    }

    @Transactional(readOnly = true)
    public Student get(Integer id) {
        Optional<Student> studentResponse = studentRepository.findById(id);
        Student getResponse = studentResponse.get();
        return getResponse;
    }


    @Transactional
    public String delete(Integer id) {
        studentRepository.deleteById(id);
        return null;
    }

    @Transactional
    public Double avgRollNumbers() {
        return studentRepository.avgRollNumbers();
    }


    @Transactional
    public List findStudentCount() {
        return studentRepository.findStudentCount();
    }


    @Transactional(readOnly = true)
    public List<JoinDto> join() {
        return studentRepository.join();
    }

    @Transactional(readOnly = true)
    public List<JoinDto> rightJoin() {
        return studentRepository.rightJoin();
    }

    @Transactional(readOnly = true)
    public List<JoinDto> crossJoin() {
        return studentRepository.crossJoin();
    }

    @Transactional
    public Integer validId(int id) {
        return studentRepository.validId(id);
    }

    @Override
    public void findById(Integer id) {

    }
}