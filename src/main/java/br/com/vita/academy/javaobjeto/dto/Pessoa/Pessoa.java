package br.com.vita.academy.javaobjeto.dto.Pessoa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Pessoa {
    @NotBlank(message = "Nome vazio, preencha o nome!")
    private String nome;
    @NotNull(message = "Idade vazia, preencha a idade!")
    private int idade;
    @NotBlank(message = "Endereço vazio, preencha o endereço!")
    private String endereco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "Pessoa [endereco=" + endereco + ", idade=" + idade + ", nome=" + nome + "]";
    }
}
