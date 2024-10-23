public class LampadaRGB extends Observable implements DispositivoCorAjustavel, DispositivoPotenciaAjustavel {

    @Override
    public void ajustaPotencia() {
        System.out.println("A potência da lâmpada RBG foi ajustada"); /* não modifique */
         notifyObservers();
    }

    @Override
    public void ligue() {
        System.out.println("A lâmpada RBG está ligada"); /* não modifique */
         notifyObservers();
    }

    @Override
    public void desligue() {
        System.out.println("A lâmpada RBG está desligada"); /* não modifique */
         notifyObservers();
    }

    @Override
    public void ajustaCor() {
        System.out.println("A cor da lâmpada RBG foi ajustada"); /* não modifique */
         notifyObservers();
    }
    
}
