/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Murilo
 */
public class TesteMediana {
    
    public TesteMediana() {
    }
    
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
    
    @Test
    public void test(){
        
        System.out.println("Teste de cálculo da mediana");
        
        List<List<Integer>> lRet = JsonIntegerManipulator.read();

        List<Integer> l1 = lRet.get(0);
        List<Integer> l2 = lRet.get(1);
        List<Integer> l3 = lRet.get(2);
        
       double f = Operations.calculaMediana(l1);
       double g = Operations.calculaMediana(l2);
       double h = Operations.calculaMediana(l3);
        
        assertEquals(6.0d,f,0.01);
        assertEquals(9.0d,g,0.01);
        assertEquals(21.0d,h,0.01);
    }
}
