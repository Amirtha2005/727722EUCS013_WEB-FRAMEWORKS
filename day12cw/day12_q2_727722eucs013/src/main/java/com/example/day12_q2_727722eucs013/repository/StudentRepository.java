package com.example.day12_q2_727722eucs013.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.day12_q2_727722eucs013.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<Student>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<Student> getStudentsLeftOuter();

    

    
}
