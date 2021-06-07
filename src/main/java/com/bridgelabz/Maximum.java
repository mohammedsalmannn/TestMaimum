package com.bridgelabz;


public class Maximum<D extends Comparable> {
    D a;
    D b;

    public Maximum(D a, D b, D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    D c;


    //.......GenricSs MethodSs......//

    public static <D extends Comparable> D maximum(D[] arr) {
        D temp = arr[0];
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
    //.....Grenrics Method Using Genric Class.....//
    public static<D extends Comparable> D GenMaximumTow( D firstValue, D secondValue, D thirdValue) {
        D max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }
}