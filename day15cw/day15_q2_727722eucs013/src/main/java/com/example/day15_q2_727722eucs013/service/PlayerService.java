package com.example.day15_q2_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day15_q2_727722eucs013.model.Player;
import com.example.day15_q2_727722eucs013.repository.PlayerRepo;


@Service
public class PlayerService {
    @Autowired
    public PlayerRepo playerRepo;

    public Player postData(Player p){
        return playerRepo.save(p);
    }

    public Player getOneData(int id){
        return playerRepo.findById(id).orElseThrow();
    }

    public List<Player> getData(){
        return playerRepo.findAll();
    }
}
