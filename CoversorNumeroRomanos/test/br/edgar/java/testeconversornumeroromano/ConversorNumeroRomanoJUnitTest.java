/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edgar.java.testeconversornumeroromano;

import br.edgar.java.coversornumeroromano.ConversorNumeroRomano;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgar
 */
public class ConversorNumeroRomanoJUnitTest {
    private ConversorNumeroRomano conversor;

    public ConversorNumeroRomanoJUnitTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void ConversorNumeroRomano(){
    conversor= new ConversorNumeroRomano();
    }
    public void setUp() {
    }
    
           
    @After
    public void tearDown() {
    }

    @Test
    public void converteOSimboloI(){
    int obtido = conversor.converte("I");
    assertEquals(1,obtido);
    }
    @Test
    public void converteOSimboloV(){
    int obtido = conversor.converte("V");
    assertEquals(5,obtido);
    }
    @Test
    public void converteOSimboloL(){
    int obtido = conversor.converte("L");
    assertEquals(50,obtido);
    }
    @Test
    public void converteOSimboloC(){
    int obtido = conversor.converte("C");
    assertEquals(100,obtido);
    }
    @Test
    public void converteOSimboloD(){
    int obtido = conversor.converte("D");
    assertEquals(500,obtido);
    }
    @Test
    public void converteOSimboloM(){
    int obtido = conversor.converte("M");
    assertEquals(1000,obtido);
    }
    @Test
    public void converteOSimboloII(){
    int obtido = conversor.converte("II");
    assertEquals(2,obtido);
    }
     @Test
    public void converteOSimboloXXII(){
    int obtido = conversor.converte("XXII");
    assertEquals(22,obtido);
    }
    @Test
    public void converteOSimboloIV(){
    int obtido = conversor.converte("IV");
    assertEquals(4,obtido);
    }
    @Test
    public void converteNumeroMCDLXXIII(){
    int obtido = conversor.converte("MCDLXXIII");
    assertEquals(1473,obtido);
    
    }
}
