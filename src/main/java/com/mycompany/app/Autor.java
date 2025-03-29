public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;
    private Livro[] obrasPublicadasPorGenero;

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

    public String getObrasPublicadasPorGenero(genero: String){
        return obrasPublicadasPorGenero;
    }

    public void setObrasPublicadasPorGenero(Livro[] obrasPublicadasPorGenero){
        this.obrasPublicadasPorGenero = obrasPublicadasPorGenero;
    }
}