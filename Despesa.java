import java.time.LocalDate;

public class Despesa extends Transacao {
    private String destino;

    public Despesa (String descricao, float valor, LocalDate data, String destino) {
        super(descricao, valor, data);
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    @Override
    public String toString() {
        
    }
}
