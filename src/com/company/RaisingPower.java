package com.company;

import java.util.List;

public class RaisingPower {
    public static int raisingPower(List<Integer> arr) {
        final long formula = (long) Math.pow(10, 9) + 7;

        int result = 0;
        long modResult = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            long power = (long) Math.pow(arr.get(i), arr.get(i + 1));

            long powModFormula = power % formula;

            System.out.println(powModFormula);

            if (powModFormula > modResult) {
                modResult = powModFormula;
                result = i + 1;
            }
        }

        return result;



    }
}
