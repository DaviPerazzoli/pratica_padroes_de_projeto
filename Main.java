
import java.util.ArrayList;

/*
*  Se você está realizando esta avaliação em dupla, 
*  coloque o nome do outro aluno (que não está logado no Moodle) abaixo.
*  Se você está realizando esta avaliação sozinho, não preencha o nome abaixo.
*  Nome completo: 
*/


public class Main {
     public static void main(String[] args) {
        FabricaPratica4 fabrica = new FabricaPratica4();
        Televisao tv = fabrica.createTelevisao();
        CaixaDeSom caixa = fabrica.createCaixaDeSom();
        LampadaRGB lampada = fabrica.createLampadaRGB();

        // Cria serviços (desvinculados das classes que executam os serviços e das classes que invoccam os serviços)
        // Você deve criar instâncias com cada um dos serviços de cada um dos dispositivos
        
        // Serviços da caixa de som
        Servico ligueCaixa = fabrica.createServicoLigue(caixa);
        Servico desligueCaixa = fabrica.createServicoDesligue(caixa);
        Servico ajustaPotenciaCaixa = fabrica.createServicoAjustePotencia(caixa);
        
        //Serviços da lampada
        Servico ligueLampada = fabrica.createServicoLigue(lampada);
        Servico desligueLampada = fabrica.createServicoDesligue(lampada);
        Servico ajustaPotenciaLampada = fabrica.createServicoAjustePotencia(lampada);
        Servico ajustaCorLampada = fabrica.createServicoAjusteCor(lampada);
        
        //Serviços da TV
        Servico ligueTv = fabrica.createServicoLigue(tv);
        Servico desligueTv = fabrica.createServicoDesligue(tv);
        Servico ajustaPotenciaTv = fabrica.createServicoAjustePotencia(tv);
        Servico mudeCanalTv = fabrica.createServicoMudeCanal(tv);

        // Cria a alexa (invocador dos serviços, desvinculado dos serviços e de quem executa os serviços)
        // Cria um assiste de invocação e registre esse assistente como observador de cada um dos dispositivos
        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(ligueTv);
        servicos.add(ligueCaixa);
        servicos.add(ligueLampada);
        servicos.add(ajustaPotenciaCaixa);
        servicos.add(ajustaPotenciaTv);
        servicos.add(mudeCanalTv);
        servicos.add(ajustaPotenciaLampada);
        servicos.add(ajustaCorLampada);
        servicos.add(desligueTv);
        servicos.add(desligueCaixa);
        servicos.add(desligueLampada);
        InvocadorServicos alexa = fabrica.createInvocadorServicos(servicos);
        
        AssistenteDeInvocacao assistente = fabrica.createAssistenteDeInvocacao();
        tv.addObserver(assistente);
        caixa.addObserver(assistente);
        lampada.addObserver(assistente);


        // Invocador dispara serviços para serem executados pelos receptores dos serviços)
        // Você deve fazer com que o assistente execute cada um dos serviços em cada um dos dispositivos,
        // na seguinte ordem: ligueTelevisao, ligueCaixaDeSom, ligueLampadaRGB, ajusteVolumeCaixaSom,
        // ajusteVolumeTelevisao, ajusteCanalTelevisao, ajusteBrilhoLampada, ajusteCorLampada, 
        // desligueTelevisao, desligueCaixaDeSom, desligueLampadaRGB
        alexa.executeServicos();
    }
}
