package com.ProjetoAngular.demo.controller;

import com.ProjetoAngular.demo.model.Nota;
import com.ProjetoAngular.demo.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
@CrossOrigin("*")
public class NotaController {

    @Autowired
    private NotaRepository repository;

    // 🔍 LISTAR
    @GetMapping
    public List<Nota> listar() {
        return repository.findAll();
    }

    // ➕ SALVAR
    @PostMapping
    public Nota salvar(@RequestBody Nota nota) {
        return repository.save(nota);
    }

    // ❌ EXCLUIR
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}