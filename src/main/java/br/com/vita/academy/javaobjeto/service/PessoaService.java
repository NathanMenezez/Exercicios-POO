package br.com.vita.academy.javaobjeto.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.vita.academy.javaobjeto.dto.Pessoa.Funcionario;

@Service
public class PessoaService {
    
    public ResponseEntity<String> cadastrar(Funcionario funcionario){
        return ResponseEntity.status(200).body("Colaborador Cadastrado com Sucesso! \n Colaborador Cadastrado: " + funcionario);
    }

    public void alterar(){}
    
    public void buscar(){}
    
    public void deletar(){}

    public String teste() {
        return "API FUNCIONANDO";
    }
    
}
