/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import activitat2m5uf2.CostPersonal;
import activitat2m5uf2.Treballador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class testCost {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //Test pel treballador 0, retorna 0 ja que es director
    @Test
    public final void tipusTreballador0() {

        Treballador treballador = new Treballador(0, 2000, 15);

        assertEquals(0, CostPersonal.tipusTreballador(treballador));
    }
    //Test pel treballador amb numero 1, retorna 1 ja que es subdirector
    @Test
    public final void tipusTreballador1() {

        Treballador treballadors = new Treballador(1, 1000, 15);

        assertEquals(1, CostPersonal.tipusTreballador(treballadors));
    }
    //Test pel treballador 2, al ser treballador normal es 2
    @Test
    public final void tipusTreballador2() {

        Treballador treballador = new Treballador(2, 2000, 15);

        assertEquals(2, CostPersonal.tipusTreballador(treballador));
    }    
    //Dona error donat que no hi ha cap treballador que sigui 3
    @Test
    public final void tipusTreballador3() {
        
       Treballador treballador = new Treballador(3, 2000, 15);
        
        
        assertEquals(error , CostPersonal.tipusTreballador(treballador));
    }
     
    @Test
    public final void costFinal1() {

        Treballador treballador = new Treballador(2, 2000, 15);
        int num = 2;

        assertEquals(2300, 00, CostPersonal.costFinal(treballador, num));
    }

    @Test
    public final void costFinal2() {

        Treballador treballador = new Treballador(1, 2000, 15);
        int num = 0;

        assertEquals(2000, 00, CostPersonal.costFinal(treballador, num));
    }

    @Test
    public final void costFinal3() {
        
       Treballador treballador = new Treballador(3, 2000, 15);
       int num = 2;
        
        assertEquals(error, CostPersonal.tipusTreballador(treballador));
    }
}
