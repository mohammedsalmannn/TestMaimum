package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximunTest {
    @Test
    public void testMaximum_Integer_At_FirstPoisiton_Gives_True() {
        Assert.assertEquals((Integer) 3,Maximum.maxInterge(3,2,1));
    }

    @Test
    public void estMaximum_Integer_At_ScondPoisiton_Gives_True() {

        Assert.assertEquals((Integer) 3,Maximum.maxInterge(2,3,1));
    }

    @Test
    public void stMaximum_Integer_At_ThirdPoisiton_Gives_True() {
        Assert.assertEquals((Integer)3,Maximum.maxInterge(1,2,3));
    }
}
