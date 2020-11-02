package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import services.CreditCardChecker;

public class CreditCardCheckerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetLongNumber() throws Exception {
        CreditCardChecker checker = new CreditCardChecker("4485735287746637");

        assertEquals("4485735287746637", checker.getLongNumber());
    }

    @Test
    public void testIsCorrectLength() throws Exception {
        CreditCardChecker checker = new CreditCardChecker("4485735287746637");

        assertTrue(checker.isCorrectLength());
    }

    @Test
    public void testFirstFifteen() throws Exception {
        CreditCardChecker checker = new CreditCardChecker("4485735287746637");

        assertEquals("448573528774663", checker.firstFifteen());
    }

    @Test
    public void testFindC() throws Exception {
        CreditCardChecker checker = new CreditCardChecker("4485735287746637");

        assertEquals(2, checker.findC(78));
    }

    @Test
    public void testCalculateCheckNumber() throws Exception {
        CreditCardChecker checker = new CreditCardChecker("4916592478445662");

        assertEquals(2, checker.calculateCheckNumber());
    }
} 
