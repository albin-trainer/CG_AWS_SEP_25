package com.cg.service;

import java.util.List;

import com.cg.entity.Cab;

public interface CabService {
	  public Cab saveCab(Cab cab);
	  public List<Cab> getAllCabs();
	  public Cab searchByCabType(String cabType);
	  public void deleteCab(int id);
}
