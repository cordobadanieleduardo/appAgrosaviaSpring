package com.ganaderia.ganaderia.controllers;
import com.ganaderia.ganaderia.entities.User;
import com.ganaderia.ganaderia.interfaces.service.IUserService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private IUserService service;

    @GetMapping
    public List<User> getList() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Optional<User> userOptional= service.findByAll(id);

        if(userOptional.isPresent()){
    
            //return ResponseEntity.ok(userOptional.orElseThrow());
            return ResponseEntity.status(HttpStatus.OK).body(userOptional.orElseThrow());
        } 
        //return ResponseEntity.notFound().build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonMap("error","el usuario no se encontró por el id "+id));
    
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
            
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(user));
    }
    

    
    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id,@RequestBody User user) {
        Optional<User> userOpt =service.findByAll(id);    
        if (userOpt.isPresent()) {
            User userDb = userOpt.get();
            userDb.setEmail(user.getEmail());
            userDb.setLastname(user.getLastname());
            userDb.setName(user.getName());
            
            return ResponseEntity.ok(service.save(userDb));
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("{id}")    
    public ResponseEntity<?> delete(@PathVariable Long id) {
        // service.deleteById(id);
        // return ResponseEntity.noContent().build();
        Optional<User> userOpt =service.findByAll(id);    
        if (userOpt.isPresent()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();

    }
    
    // public List<User> getList(@RequestParam String param) {
    //     return service.findAll();
    // }
    

}
