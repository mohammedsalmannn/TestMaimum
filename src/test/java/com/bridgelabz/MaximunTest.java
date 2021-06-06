package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximunTest {
    @Test
    public void findMaximum_Integer_At_FirstPoisiton_Gives_True() {
        //Assert.assertEquals((Integer) 3,Maximum.maxInterge(3,2,1));
//        Maximum maximum = new Maximum();
//        Integer arr[]={1,2,3};
//        Integer result = Maximum.maximum(arr);
//        Assert.assertEquals(java.util.Optional.of(3),java.util.Optional.of(result));
        //Assert.assertEquals(Maximum.maximum,3);
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
       // String[] arr = {"Apple","peach","banana"};
        Assert.assertEquals("peach",Maximum.myString("Apple","banana","peach"));
         //String result = Maximum.maximum(arr);
        //Assert.assertEquals(java.util.Optional.of("peach"),java.util.Optional.of(result));
    }
        // .....Genric methods.....//

    //.....Integer.....//
    @Test
    public void testMethod_for_Genric_method(){
        Integer result = Maximum.GenMaximum(1,3,2);
        Assert.assertEquals(java.util.Optional.of(3),java.util.Optional.of(result));
    }
    //.....Float.....//
    @Test
    public void testMethod_for_Genric_methodTwo() {
        Float result = Maximum.GenMaximum(1.1f,3.3f,2.2f);
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(result));
    }
    //.....string.....//
    @Test
    public void testMethod_for_Genric_methodThree() {
        String result = Maximum.GenMaximum("Apple","Peach","Banana");
        Assert.assertEquals(java.util.Optional.of("Peach"),java.util.Optional.of(result));
    }
}
