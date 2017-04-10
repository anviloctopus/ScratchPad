package com.theironyard.novauc;

/**
 Given three int values, a b c, return the largest.
 */
public class IntMax {
    public int intMax(int a, int b, int c) {
        int max;

        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Now check between max and c
        if (c > max) {
            max = c;
        }

        return max;


    }
}
