package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testGetNome(){
        //Instancia da classe Pessoa
        Pessoa pessoa = new Pessoa("Jessica Felix");

        //Atribuir um nome para Pessoa
        pessoa.getNome("Jess");

        //Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testSetNome(){
        //Instancia da classe Pessoa
        Pessoa pessoa = new Pessoa("Jess");

        //Define nome para Pessoa
        pessoa.setNome("Jess");

        //Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testGetLivros(){
        //Instancia para Pessoa e Autor
        Pessoa pessoa = new Pessoa("Jessica");
        Autor autor = new Autor("Jess", "Brasileira");

        //Define lista de livros para Pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
        livros[1] = new Livro("Java Avançado", autor, "tecnologia", true);
        pessoa.setLivros(livros);

        //Verifica se a lista de livros retonado é a mesma que foi definida
        assertArrayEquals(livros, pessoa.getLivros());
    }

    @Test
    public void testSetLivros() {
        //Instancia para Pessoa
        Pessoa pessoa = new Pessoa("Jessica");

        //Define lista de livros para Pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro(null, null, null, false);
        livros[1] = new Livro(null, null, null, false);
        pessoa.setLivros(livros);

        //Verifica se a lista de livros retornada é a mesma que foi definida
        assertArrayEquals(livros, pessoa.getLivros());
    }
}