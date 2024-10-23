public class ServicoAjusteCor implements Servico{
    private DispositivoCorAjustavel dispCorAjustavel;

    public ServicoAjusteCor(DispositivoCorAjustavel dispCorAjustavel) {
        this.dispCorAjustavel = dispCorAjustavel;
    }

    @Override
    public void execute() {
        dispCorAjustavel.ajustaCor();
    }
}
