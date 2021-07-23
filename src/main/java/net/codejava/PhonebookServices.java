package net.codejava;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class PhonebookServices {

	@Autowired
    private PhonebookRepository repo;
    
	public List<phonebook> listAll() {
        return repo.findAll();
    }
     
    public void save(phonebook product) {
        repo.save(product);
    }
     
    public phonebook get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}


}

