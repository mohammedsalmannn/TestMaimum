package com.bridgelabz;


public class Maximum {
    public static Integer maxInterge(Integer firstValue, Integer secondValue, Integer thirdValue) {
        int max = Math.max(firstValue,Math.max( secondValue, thirdValue));
     return max;
    }


    public static void main(String[] args) {
        Maximum maximum = new Maximum();
    }
}
