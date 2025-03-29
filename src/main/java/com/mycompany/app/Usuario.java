public class Usuario extends Pessoa{
    private int idade;
    private Emprestimo[] hist_emprestimo;

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public Emprestimo[] getHist_Emprestimo(){
        return hist_emprestimo;
    }

    public void setHist_Emprestimo(Emprestimo[] hist_emprestimo){
        this.hist_emprestimo = hist_emprestimo;
    }
}