/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.abbalib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class AbbaTest {
    
    public AbbaTest() {
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

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest01() {
        System.out.println("abba: first heap is largest");
        String firstHeap = "4958439238923098349024";
        String secondHeap = "189285";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest01() {
        System.out.println("abba: second heap is largest");
        String firstHeap = "189285";
        String secondHeap = "4958439238923098349024";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest01() {
        System.out.println("abba: third heap is largest");
        String firstHeap = "283";
        String secondHeap = "189285";
        String thirdHeap = "4958439238923098349024";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest02() {
        System.out.println("abba: first heap is largest");
        String firstHeap = "987531";
        String secondHeap = "234";
        String thirdHeap = "86364";
        String expResult = "987531";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest02() {
        System.out.println("abba: second heap is largest");
        String firstHeap = "234";
        String secondHeap = "987531";
        String thirdHeap = "86364";
        String expResult = "987531";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest02() {
        System.out.println("abba: third heap is largest");
        String firstHeap = "86364";
        String secondHeap = "234";
        String thirdHeap = "987531";
        String expResult = "987531";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest03() {
        System.out.println("abba: first heap is largest");
        String firstHeap = "7";
        String secondHeap = "5";
        String thirdHeap = "3";
        String expResult = "7";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest03() {
        System.out.println("abba: second heap is largest");
        String firstHeap = "7";
        String secondHeap = "5";
        String thirdHeap = "3";
        String expResult = "7";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest03() {
        System.out.println("abba: third heap is largest");
        String firstHeap = "7";
        String secondHeap = "5";
        String thirdHeap = "3";
        String expResult = "7";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest_spaceInTheBegin() {
        System.out.println("abba: first heap is largest and " +
                 "a space in the begin");
        String firstHeap = " 4958439238923098349024";
        String secondHeap = "189285";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest_spaceInBegin() {
        System.out.println("abba: second heap is largest and " +
                 "a space in the begin");
        String firstHeap = "189285";
        String secondHeap = " 4958439238923098349024";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest_spaceInBegin() {
        System.out.println("abba: third heap is largest and " +
                 "a space in the begin");
        String firstHeap = "283";
        String secondHeap = "189285";
        String thirdHeap = " 4958439238923098349024";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest_spaceInEnd() {
        System.out.println("abba: first heap is largest and " +
                 "a space in the end");
        String firstHeap = "4958439238923098349024 ";
        String secondHeap = "189285";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest_spaceInEnd() {
        System.out.println("abba: second heap is largest and " +
                 "a space in the end");
        String firstHeap = "189285";
        String secondHeap = "4958439238923098349024 ";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest_spaceInEnd() {
        System.out.println("abba: third heap is largest and " +
                 "a space in the end");
        String firstHeap = "283";
        String secondHeap = "189285";
        String thirdHeap = "4958439238923098349024";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest_twoSpacesInTheBegin() {
        System.out.println("abba: first heap is largest and " +
                 "two spaces in the begin");
        String firstHeap = "  4958439238923098349024";
        String secondHeap = "189285";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest_TwoSpacesInTheBegin() {
        System.out.println("abba: second heap is largest and " +
                 "two spaces in the begin");
        String firstHeap = "189285";
        String secondHeap = "  4958439238923098349024";
        String thirdHeap = "283";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest_TwoSpaceInTheBegin() {
        System.out.println("abba: third heap is largest and " +
                 "two spaces in the begin");
        String firstHeap = "283";
        String secondHeap = "189285";
        String thirdHeap = "  4958439238923098349024";
        String expResult = "4958439238923098349024";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest_SpaceInTheMiddle() {
        System.out.println("abba: first heap is largest and " +
                 "a space in the middle");
        String firstHeap = "49584392389 23098349024";
        String secondHeap = "189285";
        String thirdHeap = "283";
        String expResult = "ERROR";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest_SpaceInTheMiddle() {
        System.out.println("abba: second heap is largest and " +
                 "a space in the middle");
        String firstHeap = "189285";
        String secondHeap = "49584392389 23098349024";
        String thirdHeap = "283";
        String expResult = "ERROR";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest_SpaceInTheMiddle() {
        System.out.println("abba: third heap is largest and " +
                 "a space in the middle");
        String firstHeap = "283";
        String secondHeap = "189285";
        String thirdHeap = "4958439238 923098349024";
        String expResult = "ERROR";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_firstHeapIsLargest_illegalCharacter() {
        System.out.println("abba: an illegal character");
        String firstHeap = "49W8439238923098349024";
        String secondHeap = "189285";
        String thirdHeap = "283";
        String expResult = "ERROR";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_secondHeapIsLargest_illegalCharacter() {
        System.out.println("abba: an illegal character");
        String firstHeap = "189285";
        String secondHeap = "49W8439238923098349024";
        String thirdHeap = "283";
        String expResult = "ERROR";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void testAbba_thirdHeapIsLargest_illegalCharacter() {
        System.out.println("abba: an illegal character");
        String firstHeap = "283";
        String secondHeap = "189285";
        String thirdHeap = "49W8439238923098349024";
        String expResult = "ERROR";
        String result = Abba.abba(firstHeap, secondHeap, thirdHeap);
        assertEquals(expResult, result);
    }
}
