package com.mycompany.app;

public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] histEmprestimo;

    public Usuario(String nome, int idade){
        super(nome); //busca o construtor da classe Pessoa
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public Emprestimo[] getHistEmprestimo(){
        return histEmprestimo;
    }

    public void setHistEmprestimo(Emprestimo[] histEmprestimo){
        this.histEmprestimo = histEmprestimo;
    }
}