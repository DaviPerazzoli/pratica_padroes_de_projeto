public class CaixaDeSom extends Observable implements DispositivoPotenciaAjustavel {
    @Override
    public void ligue() {
        System.out.println("A caixa de som está ligada"); /* não modifique */
        notifyObservers();
    }

    @Override
    public void desligue() {
        System.out.println("A caixa de som está desligada"); /* não modifique */
        notifyObservers();
    }

    @Override
    public void ajustaPotencia() {
        System.out.println("volume da caixa de som ajustado"); /* não modifique */
        notifyObservers();
    }
}
