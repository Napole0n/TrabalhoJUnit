/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
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
public class TesteMedia {

    public TesteMedia() {
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
    public void test() throws IOException {
        
        System.out.println("Teste de cálculo da média");
        
        List<List<Integer>> lRet = JsonIntegerManipulator.read();

        List<Integer> l1 = lRet.get(0);
        List<Integer> l2 = lRet.get(1);
        List<Integer> l3 = lRet.get(2);

        assertEquals(7.43, Operations.calculaMedia(l1),0.01);

        assertEquals(8.33d, Operations.calculaMedia(l2),0.01);

        assertEquals(38.86d, Operations.calculaMedia(l3),0.01);

    }
}
