import java.time.LocalDate;

public class Receita extends Transacao {
    private String origem;

    public Receita(String descricao, float valor, LocalDate data, String origem) {
        super(descricao, valor, data);
        this.origem = origem;
    }

    public String getOrigem() {
        return this.origem;
    }

    @Override
    public String toString() {
        
    }
}
