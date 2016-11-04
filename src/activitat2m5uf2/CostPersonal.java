/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat2m5uf2;

/**
 *
 * @author ALUMNEDAM
 */
public class CostPersonal {
    //Variable que initzialitzem en global per poder usarla als altres metodes
    private static float costFinal = 0;
    //Variable final global per les hores extres
    private static final int horasExtras = 20;
    private static Treballador treballador = null;
    /**
     * Li entra un array de treballadors amb els diferents treballadors amb els seus atributs.
     * Un cop li entra realitza un array per anar comprovant cada treballador i sumar el costFinal
     * I retorna el costFinal
     * @param treballadors
     * @return 
     */
    public static float CostDelPersonal(Treballador treballadors[]) {
        for (int i = 0; i < treballadors.length; i++) {
            treballador = treballadors[i];
            int tipus = tipusTreballador(treballador);
            costFinal(treballador, tipus);
        }
        return costFinal;
    }
    /***
     * Li arriba el treballador que envia el metode CostDelPersonal per veure quin tipus de treballador es i retorna el tipus.
     * @param treballador
     * @return 
     */
    public static int tipusTreballador(Treballador treballador) {
        int tipus;
        if (treballador.getTipusTreballador() == Treballador.DIRECTOR) {
            tipus = Treballador.DIRECTOR;
        } else if (treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
            tipus = Treballador.SUBDIRECTOR;
        } else {
            tipus = Treballador.NORMAL;
        }
        return tipus;
    }
    /**
     * Li entra el treballador que envia el metode CostDelPersonal i el tipus de treballador per calcular el costFinal
     * I retorna el costFinal.
     * @param treballador
     * @param tipus
     * @return 
     */
    public static float costFinal(Treballador treballador, int tipus) {
        if (tipus == Treballador.DIRECTOR || tipus == Treballador.SUBDIRECTOR) {
            costFinal = costFinal + treballador.getNomina();
        } else {
            costFinal = costFinal + treballador.getNomina() + (treballador.getHoresExtres() * horasExtras);
        }
        return costFinal;
    }
}
