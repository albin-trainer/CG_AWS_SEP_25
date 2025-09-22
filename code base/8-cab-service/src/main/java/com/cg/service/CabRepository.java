package com.cg.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Cab;

import java.util.List;

@Repository
public interface CabRepository extends JpaRepository<Cab, Integer> {
    List<Cab> findByCabTypeAndBookedFalse(String cabType);
}
