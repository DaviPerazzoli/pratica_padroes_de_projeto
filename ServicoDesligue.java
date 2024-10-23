public class ServicoDesligue implements Servico {
    private Dispositivo device;

    public ServicoDesligue(Dispositivo device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.desligue();
    }
}

