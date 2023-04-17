package br.com.vita.academy.javaobjeto.dto.Pessoa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Funcionario extends Pessoa {
    @NotNull(message = "Salario vazio, preencha o salario!")
    protected Double salario;
    @NotBlank(message = "Cargo vazio, preencha o cargo!")
    protected String cargo;

    public Funcionario(Double salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }



    @Override
    public String toString() {
        return super.toString() + "Funcionario [cargo=" + cargo + ", salario=" + salario + "]";
    }
}
