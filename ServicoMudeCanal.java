public class ServicoMudeCanal implements Servico{
    private Televisao tv;

    public ServicoMudeCanal(Televisao tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.mudeCanal();
    }
}
