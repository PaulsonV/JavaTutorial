package org.me;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Paulson on 5/4/2015.
 */
public class TestCalc {
    @Test
    public void testAdd() {
        int expectedResult = 3;
        int actualResult=Calc.add(1,2);

        Assert.assertEquals(expectedResult, actualResult );
    }


}
