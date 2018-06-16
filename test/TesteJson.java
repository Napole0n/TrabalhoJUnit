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
public class TesteJson {

    public TesteJson() {
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

        JsonIntegerManipulator.clear();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();

        System.out.println("Teste do Json com gravação dos arquivos");
        
        l1.add(4);
        l1.add(6);
        l1.add(15);
        l1.add(7);
        l1.add(6);
        l1.add(6);
        l1.add(8);

        l2.add(7);
        l2.add(9);
        l2.add(1);
        l2.add(14);
        l2.add(10);
        l2.add(9);

        l3.add(13);
        l3.add(21);
        l3.add(44);
        l3.add(1);
        l3.add(98);
        l3.add(21);
        l3.add(74);

        JsonIntegerManipulator.write(l1);
        JsonIntegerManipulator.write(l2);
        JsonIntegerManipulator.write(l3);

        List<List<Integer>> lRet = JsonIntegerManipulator.read();

        List<Integer> l4 = lRet.get(0);
        List<Integer> l5 = lRet.get(1);
        List<Integer> l6 = lRet.get(2);

        assertEquals(l1, l4);
        assertEquals(l2, l5);
        assertEquals(l3, l6);

    }
}
