package com.cg.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.entity.Cab;
import com.cg.service.CabService;

import java.util.List;

@RestController
@RequestMapping("/cabs")
public class CabApi {
	@Autowired
    private  CabService cabService;

    // Create
    @PostMapping
    public ResponseEntity<Cab> addCab(@RequestBody Cab cab) {
    	System.out.println(cab.isBooked());
        return ResponseEntity.ok(cabService.saveCab(cab));
    }

    // Read all
    @GetMapping
    public ResponseEntity<List<Cab>> getAllCabs() {
        return ResponseEntity.ok(cabService.getAllCabs());
    }

    // Read by Id
    @GetMapping("/{id}")
    public ResponseEntity<Cab> getCabById(@PathVariable int id) {
        return null;
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Cab> updateCab(@PathVariable int id, @RequestBody Cab cab) {
        return  null;
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCab(@PathVariable int id) {
        cabService.deleteCab(id);
        return ResponseEntity.noContent().build();
    }

    // Search by cabType
    @GetMapping("/search")
    public ResponseEntity<Cab> searchByType(@RequestParam("cabType") String cabType) {
        return ResponseEntity.ok(cabService.searchByCabType(cabType));
    }
}
