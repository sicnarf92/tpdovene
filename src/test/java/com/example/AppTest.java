package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testConvertToJson() {
        Person person = new Person("jean", "bonbeur");
        String json = App.convertToJson(person);
        assertNotNull(json);
        assertTrue(json.contains("\"firstName\":\"jean\""));
        assertTrue(json.contains("\"lastName\":\"bonbeur\""));
    }

    public void testCapitalizeString() {
        String capitalized = App.capitalizeString("jean");
        assertEquals(capitalized, "Jean");

        capitalized = App.capitalizeString("bonbeur");
        assertEquals(capitalized, "Bonbeur");
    }
}
