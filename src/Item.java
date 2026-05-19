
import java.time.LocalDate;

public abstract class Item {
    private String id;
    protected String nome;
    protected LocalDate dataAquisicao;
    protected float valor;
    protected boolean disponivel;

    public Item(String id, String nome, LocalDate dataAquisicao, float valor){
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.valor = valor;
        this.disponivel = true;
    }

    public String getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public LocalDate getDataAquisicao(){
        return dataAquisicao;
    }

    public float getValor(){
        return valor;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public abstract  boolean emprestar();

    public abstract boolean devolver();

    @Override
    public String toString(){
        return "------------";
    }

}
