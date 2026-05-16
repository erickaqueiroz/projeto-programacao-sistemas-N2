import java.time.LocalDate;

public abstract class Transacao {
    protected String descricao;
    protected float valor;
    protected LocalDate data;

    Transacao(String descricao, float valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public float getValor() {
        return this.valor;
    }

    public LocalDate getData() {
        return this.data;
    }
}
