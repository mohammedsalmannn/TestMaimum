package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximunTest {
    @Test
    public void findMaximum_Integer_At_FirstPoisiton_Gives_True() {
        Assert.assertEquals((Integer) 3,Maximum.maxInterge(3,2,1));
    }

    @Test
    public void findMaximum_Integer_At_ScondPoisiton_Gives_True() {

        Assert.assertEquals((Integer) 3,Maximum.maxInterge(2,3,1));
    }

    @Test
    public void findMaximum_Integer_At_ThirdPoisiton_Gives_True() {
        Assert.assertEquals((Integer)3,Maximum.maxInterge(1,2,3));
    }

    //.........FLoat.......//

    @Test
    public void findMaximum_Float_At_FirstPoisiton_Gives_True() {
        Assert.assertEquals((Float)3.3f,Maximum.myFloat(3.3f,2.2f,1.1f));
    }

    @Test
    public void find_Maximum_Float_At_SecondPoisiton_Gives_True() {
        Assert.assertEquals((Float)3.3f,Maximum.myFloat(1.1f,3.3f,2.2f));

    }

    @Test
    public void find_Maximum_Float_At_ThirdPoisiton_Gives_True() {
        Assert.assertEquals((Float)3.3f,Maximum.myFloat(1.1f,2.2f,3.3f));
    }

    @Test
    public void find_Maximum_Stirng_At_firstPoisiton_Gives_True() {
        Assert.assertEquals("peach",Maximum.myString("peach","Apple","banana"));
    }

    @Test
    public void find_Maximum_Stirng_At_SecondPoisiton_Gives_True() {
        Assert.assertEquals("peach",Maximum.myString("banana","peach","Apple"));
    }

    @Test
    public void find_Maximum_Stirng_At_ThirdPoisiton_Gives_True() {
        Assert.assertEquals("peach",Maximum.myString("Apple","banana","peach"));
    }
}
