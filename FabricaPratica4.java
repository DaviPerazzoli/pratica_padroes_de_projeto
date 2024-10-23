
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class FabricaPratica4 {
    public Televisao createTelevisao(){
        return new Televisao();
    }
    
    public CaixaDeSom createCaixaDeSom(){
        return new CaixaDeSom();
    } 
    
    public LampadaRGB createLampadaRGB(){
        return new LampadaRGB();
    } 
    
    public ServicoAjusteCor createServicoAjusteCor(DispositivoCorAjustavel device){
        return new ServicoAjusteCor(device);
    }
    
    public ServicoAjustePotencia createServicoAjustePotencia(DispositivoPotenciaAjustavel device){
        return new ServicoAjustePotencia(device);
    }
    
    public ServicoDesligue createServicoDesligue(Dispositivo device){
        return new ServicoDesligue(device);
    }
    
    public ServicoLigue createServicoLigue(Dispositivo device){
        return new ServicoLigue(device);
    }
    
    public ServicoMudeCanal createServicoMudeCanal(Televisao tv){
        return new ServicoMudeCanal(tv);
    }
    
    public AssistenteDeInvocacao createAssistenteDeInvocacao(){
        return new AssistenteDeInvocacao();
    }
    
    public InvocadorServicos createInvocadorServicos(List<Servico> servicos){
        return new InvocadorServicos(servicos);
    }
}
