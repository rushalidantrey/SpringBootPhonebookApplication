package net.codejava;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class PhonebookController {

	@Autowired
    private PhonebookServices service;
	
	@GetMapping("/phonebook")
	public List<phonebook> listAll() {
        return service.listAll();
    }
	
	@GetMapping("/phonebook/{id}")
	public ResponseEntity<phonebook> get(@PathVariable Integer id) {
	    try {
	    	phonebook product = service.get(id);
	        return new ResponseEntity<phonebook>(product, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<phonebook>(HttpStatus.NOT_FOUND);
	    }   

	}
	
	@PostMapping("/phonebook")
	public void add(@RequestBody phonebook product) {
	    service.save(product);
	}
	
	@PutMapping("/phonebook/{id}")
	public ResponseEntity<?> update(@RequestBody phonebook product, @PathVariable Integer id) {
	    try {
	    	phonebook existProduct = service.get(id);
	        service.save(product);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/phonebook/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
}
