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
public class Treballador {
    
    final static int DIRECTOR=0;
    final static int SUBDIRECTOR=1; 
    final static int NORMAL=2;
    private int tipusTreballador;
    private int nomina;
    private int horesExtra;

    public Treballador(int tipusTreballador, int nomina, int horesExtra) {
        this.tipusTreballador = tipusTreballador;
        this.nomina = nomina;
        this.horesExtra = horesExtra;
    }
    
    public int getTipusTreballador(){
        return this.tipusTreballador;
    }
    
    public int getNomina(){
        return this.nomina;
    }
    
    public int getHoresExtres(){
        return this.horesExtra;
    }
    
}