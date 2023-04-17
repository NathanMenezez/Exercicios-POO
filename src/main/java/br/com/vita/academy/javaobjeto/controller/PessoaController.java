package br.com.vita.academy.javaobjeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vita.academy.javaobjeto.dto.Pessoa.Funcionario;
import br.com.vita.academy.javaobjeto.service.PessoaService;
import jakarta.validation.Valid;

@RestController
public class PessoaController {
    
    @Autowired
    PessoaService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody @Valid Funcionario funcionario){
        return service.cadastrar(funcionario);
    }

    @PutMapping("/alterar")
    public void alterar(){
        service.alterar();
    }
    
    @GetMapping("/buscar/{id}")
    public void buscar(){
        service.buscar();
    }
    
    @DeleteMapping("/deletar")
    public void deletar(){
        service.deletar();
    }
    

    @GetMapping("/teste")
    public String teste(){
        return service.teste();
    }
}
