public class ServicoAjustePotencia implements Servico{
    private DispositivoPotenciaAjustavel dispPotenciaAjustavel;

    public ServicoAjustePotencia(DispositivoPotenciaAjustavel dispPotenciaAjustavel) {
        this.dispPotenciaAjustavel = dispPotenciaAjustavel;
    }

    @Override
    public void execute() {
        dispPotenciaAjustavel.ajustaPotencia();
    }
}
