// Nome: Ericka Fernanda Lima de Queiroz - 10420084
// Nome: Leticia Sampaio Cosmo - 10438865

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Item> itens;

    public Biblioteca(){   
        itens = new ArrayList<>();
    }
    
    public void cadastrar(Item item){
        itens.add(item);
    }

    public String buscar(String termo){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < itens.size(); i++){
            Item item = itens.get(i);
            if(item.getId().contains(termo) || item.getNome().contains(termo)){
                sb.append(item.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public int emprestar(String id){
        for(Item item : itens){
            if(item.getId().equals(id)){
                if(item.isDisponivel()){
                    item.emprestar();
                    return 1; 
                } else {
                    return 2; 
                }
            }
        }
        return 3;
    }

    public int devolver(String id){
        for(Item item : itens){
            if(item.getId().equals(id)){
                if(!(item.isDisponivel())){
                    item.devolver();
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 3;
    }

    public String obterAcervo(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
