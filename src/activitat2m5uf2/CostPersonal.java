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

    private static float costFinal = 0;
    private static int horasExtras = 20;
    private static Treballador treballador = null;

    public static float CostDelPersonal(Treballador treballadors[]) {
        for (int i = 0; i < treballadors.length; i++) {
            treballador = treballadors[i];
            int tipus = tipusTreballador(treballador);
            costFinal(treballador, tipus);
        }
        return costFinal;
    }

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

    public static float costFinal(Treballador treballador, int tipus) {
        if (tipus == Treballador.DIRECTOR || tipus == Treballador.SUBDIRECTOR) {
            costFinal = costFinal + treballador.getNomina();
        } else {
            costFinal = costFinal + treballador.getNomina() + (treballador.getHoresExtres() * horasExtras);
        }
        return costFinal;
    }
}
