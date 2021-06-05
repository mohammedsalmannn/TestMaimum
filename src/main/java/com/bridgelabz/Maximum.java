package com.bridgelabz;


public class Maximum {
    public static Float myFloat(Float firstValue, Float secondValue, Float thirdValue){
        Float max = Math.max(firstValue,Math.max(secondValue,thirdValue));
        return max;
    }

    public static Integer maxInterge(Integer firstValue, Integer secondValue, Integer thirdValue) {
        int max = Math.max(firstValue,Math.max( secondValue, thirdValue));
     return max;
    }



    public static void main(String[] args) {
        Maximum maximum = new Maximum();
    }
}
