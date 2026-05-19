import java.time.LocalDate;

public class Livro extends Item{
    private String autor;

    public Livro(String id, String nome, LocalDate dataAquisicao, float valor, String autor){
        super(id, nome, dataAquisicao, valor);
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public boolean emprestar(){
        if(disponivel){
            disponivel = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return id + " | " + nome + " | " + autor + 
        " | Disponível: " + disponivel;
    }
}
