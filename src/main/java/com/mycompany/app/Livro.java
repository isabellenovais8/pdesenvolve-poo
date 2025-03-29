public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;
    
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }
}