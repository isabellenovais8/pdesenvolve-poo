import java.util.Date;

public class Emprestimo {
    private Date data_retirada;
    private Date data_devolucao;
    private Livro livro;
    private Usuario usuario;

    public Date getData_Retirada(){
        return data_retirada;
    }

    public void setData_Retirada(Date data_retirada){
        this.data_retirada = data_retirada;
    }

    public Date getData_Devolucao(){
        return data_devolucao;
    }

    public void setData_Devolucao(Date data_devolucao){
        this.data_devolucao = data_devolucao;
    }

    public Livro getLivro(){
        return livro;
    }

    public void setLivro(Livro[] livro){
        this.livro = livro;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}