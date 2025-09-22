package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Cab;

import java.util.List;
import java.util.Optional;

@Service
public class CabServiceImpl implements CabService {
 @Autowired
    private  CabRepository cabRepository;


    // Create or Update
    public Cab saveCab(Cab cab) {
        return cabRepository.save(cab);
    }

    // Read all
    public List<Cab> getAllCabs() {
        return cabRepository.findAll();
    }

    // Read by ID
    public Optional<Cab> getCabById(int id) {
        return cabRepository.findById(id);
    }

    // Delete
    public void deleteCab(int id) {
        cabRepository.deleteById(id);
    }

    // Search by cabType
    public Cab searchByCabType(String cabType) {
    	List<Cab> list= cabRepository.findByCabTypeAndBookedFalse(cabType);
    	if(!list.isEmpty())
    		return  list.get(0);
    	return null;
    }
}
