import java.time.LocalDate;

public abstract class Transacao {
    protected String descricao;
    protected float valor;
    protected LocalDate data;

    public Transacao(String descricao, float valor, LocalDate data){
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getDescricao(){
        return descricao;
    }

    public float getValor(){
        return valor;
    }

    public LocalDate getData(){
        return data;
    }

    
}
