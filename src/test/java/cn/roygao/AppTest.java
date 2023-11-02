package cn.roygao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCalculate()
    {
        int a = 10;
        int b = App.calculate(a);
        assertEquals(200L, (long) b);
    }
}
