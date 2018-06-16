/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class TesteVariancia {
    
    public TesteVariancia() {
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
       
        System.out.println("Teste de cálculo da variância");
        
        List<List<Integer>> lRet = JsonIntegerManipulator.read();

        List<Integer> l1 = lRet.get(0);
        List<Integer> l2 = lRet.get(1);
        List<Integer> l3 = lRet.get(2);
      
        assertEquals(12.62d,Operations.calculavariancia(l1),0.001);
        assertEquals(18.27d,Operations.calculavariancia(l2),0.001);
        assertEquals(1.249d,Operations.calculavariancia(l3),0.001);
        
        
    }
}
