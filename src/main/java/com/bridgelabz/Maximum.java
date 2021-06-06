package com.bridgelabz;


public class Maximum {
    public static Float myFloat(Float firstValue, Float secondValue, Float thirdValue) {
        Maximum maximum = new Maximum();
        Float max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }

    public static Integer maxInterge(Integer firstValue, Integer secondValue, Integer thirdValue) {
//        int max = Math.max(firstValue,Math.max( secondValue, thirdValue));
//     return max;
        Maximum maximum = new Maximum();
        Integer max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }


    public static void main(String[] args) {
        Maximum maximum = new Maximum();
    }

    public static String myString(String firstValue, String secondValue, String thirdValue) {
        String max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }
    //.......GenricSs MethodSs......//

    public static <E extends Comparable> E maximum(E[] arr) {
        E temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp.compareTo(arr[i]) < 0)
                temp = arr[i];
        }
        printMax(temp);
        return temp;

    }

    private static <E extends Comparable> void printMax(E a) {
        System.out.println("The Maximun Value is : " + a);
    }
        //..Genrics methods
    public static<E extends Comparable> E GenMaximum( E firstValue, E secondValue, E thirdValue) {
         E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }
}