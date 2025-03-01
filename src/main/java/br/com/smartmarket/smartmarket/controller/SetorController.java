package br.com.smartmarket.smartmarket.controller;

import br.com.smartmarket.smartmarket.model.Setor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SetorController {

    private List<Setor> repository = new ArrayList<>();

    @GetMapping("/setor")
    public List<Setor> index() {
        return repository;
    }

    @PostMapping("/setor")
    public ResponseEntity<Setor> create(@RequestBody Setor setor) {
        System.out.println("Cadastrando setor " + setor.getNome());
        repository.add(setor);

        return ResponseEntity.status(201).body(setor);
    }

    @GetMapping("/setor/{id}")
    public ResponseEntity<Setor> get(@PathVariable Long id) {
        System.out.println("Buscando setor " + id);

        var setor = repository.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();

        if (setor.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(setor.get());
    }
}
