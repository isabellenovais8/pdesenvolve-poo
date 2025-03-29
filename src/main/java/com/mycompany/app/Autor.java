package com.mycompany.app;

public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;

    public Autor(String nome, String nacionalidade){
        super(nome); //busca o construtor da classe Pessoa
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getObrasPublicadas(){
        return obrasPublicadas;
    }

    public void setObrasPublicadas(Livro[] obrasPublicadas){
        this.obrasPublicadas = obrasPublicadas;
    }
}