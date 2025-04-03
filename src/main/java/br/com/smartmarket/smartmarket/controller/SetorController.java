package br.com.smartmarket.smartmarket.controller;

import br.com.smartmarket.smartmarket.model.Setor;
import br.com.smartmarket.smartmarket.repository.SetorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SetorController {

    @Autowired
    private SetorRepository repository;

    @GetMapping("/setor")
    public List<Setor> index() {
        return repository.findAll();
    }

    @PostMapping("/setor")
    public ResponseEntity<Setor> create(@RequestBody @Valid Setor setor) {
        repository.save(setor);
        return ResponseEntity.status(201).body(setor);
    }

    @GetMapping("/setor/{id}")
    public Setor get(@PathVariable Long id) {
        return getSetor(id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void destroy(@PathVariable Long id) {
        repository.delete(getSetor(id));
    }


    private Setor getSetor(Long id) {
        return repository.findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
    }
}
