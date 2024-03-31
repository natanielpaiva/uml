package org.example;

public class Professor extends Pessoa {
    private String especialidade;

    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }
}
