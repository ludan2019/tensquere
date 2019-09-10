package com.service;

import com.pojo.Spit;
import com.respository.SpitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SpitService {

    @Autowired
    private SpitRepository spitRepository;

    public void saveSpit(Spit spit){
        spitRepository.save(spit);
    }

    public void updateSpit(Spit spit){
        spitRepository.save(spit);
    }

    public void deleteSpit(String id){
        spitRepository.deleteById(id);
    }

    public List<Spit> querySpitAll(){
         return spitRepository.findAll();
    }

    public Spit querySpitById(String id){
        return spitRepository.findById(id).get();
    }
}
