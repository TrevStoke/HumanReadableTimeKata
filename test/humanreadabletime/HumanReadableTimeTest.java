/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanreadabletime;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trevor
 */
public class HumanReadableTimeTest {
    
    public HumanReadableTimeTest() {
    }

    @Test
    public void testZeroes() {
        String actual = HumanReadableTime.convertSeconds(0);
        String expected = "00:00:00";
        assertTrue(actual.equals(expected));
    }
    
    @Test
    public void test5Seconds() {
        String actual = HumanReadableTime.convertSeconds(5);
        String expected = "00:00:05";
        assertTrue(actual.equals(expected));
    }
    
    @Test
    public void test60Seconds() {
        String actual = HumanReadableTime.convertSeconds(60);
        String expected = "00:01:00";
        assertTrue(actual.equals(expected));
    }
    
    @Test
    public void test24HoursMinus1Second() {
        String actual = HumanReadableTime.convertSeconds(86399);
        String expected = "23:59:59";
        assertTrue(actual.equals(expected));
    }
    
    @Test
    public void test100HoursMinus1Second() {
        String actual = HumanReadableTime.convertSeconds(359999);
        String expected = "99:59:59";
        assertTrue(actual.equals(expected));
    }
    
}
