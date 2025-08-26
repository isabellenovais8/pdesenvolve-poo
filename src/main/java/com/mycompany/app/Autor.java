package com.mycompany.app;

public class Autor extends Pessoa {
    public Autor(String nome, int idade,  String nacionalidade) {
        super(nome, idade, nacionalidade); // idade opcional para autores
    }
}
