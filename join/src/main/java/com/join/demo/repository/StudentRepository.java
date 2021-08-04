package com.join.demo.repository;


import java.util.List;

import com.join.demo.dto.JoinDto;
import com.join.demo.dto.StudentDto;
import com.join.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByAddressCity(String city);

    @Query(value = "SELECT sum(roll_number) FROM Student", nativeQuery = true)
    public Long sumRollNumbers();

    @Query(value = "SELECT  avg (roll_number) FROM Student ", nativeQuery = true)
    public Double avgRollNumbers();


    @Query("select s.name as name, count(s) as cnt " +
            "from Student s " +
            "group by s.name")
    List<StudentDto> findStudentCount();


    @Query(value = "SELECT s.id as id,s.name as name, a.city as addressCity,a.house_number as houseNumber \n" +
            "FROM student s\n" +
            "LEFT JOIN address a ON s.address_id = a.address_id;", nativeQuery = true)
    public List<JoinDto> join();


    @Query(value = "SELECT s.id as id,s.name as name, a.city as addressCity,a.house_number as houseNumber \n" +
            "FROM student s\n" +
            "RIGHT JOIN address a ON s.address_id = a.address_id;", nativeQuery = true)
    public List<JoinDto> rightJoin();


    @Query(value = "SELECT s.id as id,s.name as name, a.city as addressCity,a.house_number as houseNumber \n" +
            "FROM student s\n" +
            "CROSS JOIN address a ON s.address_id = a.address_id;", nativeQuery = true)
    public List<JoinDto> crossJoin();

    @Query(value = "SELECT * FROM Student s where s.id=:id", nativeQuery = true)
    public Integer validId(int id);

    Object findUserById(Integer id);
}
