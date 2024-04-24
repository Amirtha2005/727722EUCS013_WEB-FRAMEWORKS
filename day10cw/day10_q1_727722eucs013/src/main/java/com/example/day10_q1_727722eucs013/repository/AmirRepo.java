package com.example.day10_q1_727722eucs013.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.day10_q1_727722eucs013.model.AmirDoor;



@Repository
public interface AmirRepo extends JpaRepository<AmirDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<AmirDoor> findByColor(String color);

    public List<AmirDoor> findByDoorType(String doortype);
}
