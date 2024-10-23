
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class InvocadorServicos {
    private List<Servico> servicos;
    
    public InvocadorServicos(List<Servico> lista){
        servicos = lista;
    }
    
    public void executeServicos(){
        servicos.forEach(s -> s.execute());
    }
}
