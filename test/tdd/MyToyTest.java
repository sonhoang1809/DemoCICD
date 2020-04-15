/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static utils.MyToys.cF;

/**
 *
 * @author sonho
 */
public class MyToyTest {
    //
    public MyToyTest() {
    }
    @Test
    public void testSuccessfullCase(){
        assertEquals(1, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCase(){
        cF(-5);
        cF(100);
    }
}
