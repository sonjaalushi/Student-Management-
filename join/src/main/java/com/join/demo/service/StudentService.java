package com.join.demo.service;

import java.util.List;

import com.join.demo.dto.JoinDto;
import com.join.demo.entity.Student;
import org.springframework.stereotype.Component;


@Component
public interface StudentService {
    public Student saveAllStudent(Student student);

    List<Student> findByAddressCity(String city);

    public long getCountOfEntities();

    public Long sumRollNumbers();


    public Student update(Student student);

    public Student get(Integer id);

    public String delete(Integer id);

    public Double avgRollNumbers();


    public List findStudentCount();


    public List<JoinDto> join();

    public List<JoinDto> rightJoin();

    public List<JoinDto> crossJoin();

    void findById(Integer id);

    public Integer validId(int id);
}