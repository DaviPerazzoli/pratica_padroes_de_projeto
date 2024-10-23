public class ServicoLigue implements Servico {
    private Dispositivo dispositivo;

    public ServicoLigue(Dispositivo device) {
        this.dispositivo = device;
    }

    @Override
    public void execute() {
        dispositivo.ligue();
    }
}
