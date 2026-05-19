import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Despesa extends Transacao{
    private String destino;

    public Despesa(String descricao, float valor, LocalDate data, String destino){
        super(descricao, valor, data);
        this.destino = destino;
    }

    public String getDestino(){
        return destino;
    }

    @Override
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "------DESPESA------" + 
        getDescricao() + " R$ " + String.format("%.2f", getValor())
             + " " + getData().format(dtf)
             + " " + getDestino();
    }
    
}
