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
public class TesteModa {
    
    public TesteModa() {
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

    @Test
    public void test(){
        
        System.out.println("Teste de cálculo da moda");
        
        List<List<Integer>> lRet = JsonIntegerManipulator.read();

        List<Integer> l1 = lRet.get(0);
        List<Integer> l2 = lRet.get(1);
        List<Integer> l3 = lRet.get(2);
        
        assertEquals(6, Operations.calculaModa(l1));
        assertEquals(9, Operations.calculaModa(l2));
        assertEquals(21, Operations.calculaModa(l3));
    }
}
