package com.bridgelabz;

import com.bridgelabz.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximunTest {
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
    //...Genric Class...//

    @Test
    public void testMethod_for_Genric_Class() {
        //s=com.bridgelabz.Maximum.GenMaximumTow()
        Assert.assertEquals(java.util.Optional.of(3),java.util.Optional.of(Maximum.GenMaximumTow(1,3,2)));
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(Maximum.GenMaximumTow(1.1f,2.2f,3.3f)));
        Assert.assertEquals(java.util.Optional.of("Peach"),java.util.Optional.of(Maximum.GenMaximumTow("Peach","Banana","Apple")));


    }
}
