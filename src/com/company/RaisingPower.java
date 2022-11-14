package com.company;

import java.math.BigDecimal;
import java.util.List;

public class RaisingPower {
//    public static int raisingPower(List<Integer> arr) {
//        final long formula = (long) Math.pow(10, 9) + 7;
//
//        int result = 0;
//        long modResult = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.size() - 1; i++) {
//            long power = (long) Math.pow(arr.get(i), arr.get(i + 1));
//
//            long powModFormula = power % formula;
//
//            System.out.println(powModFormula);
//
//            if (powModFormula > modResult) {
//                modResult = powModFormula;
//                result = i + 1;
//            }
//        }
//
//        return result;
//
//
//
//    }

    public static int raisingPower(List<Integer> arr) {
        final BigDecimal bigFormula = new BigDecimal(Math.pow(10, 9) + 7);

        int result = 0;
        BigDecimal bigModResult = new BigDecimal(Integer.MIN_VALUE);

        for (int i = 0; i < arr.size() - 1; i++) {

            BigDecimal bigPower = new BigDecimal(Math.pow(arr.get(i), arr.get(i + 1)));


            BigDecimal remainder = bigPower.remainder(bigFormula);

            System.out.println(remainder);


            if (remainder.compareTo(bigModResult) > 0) {
                bigModResult = remainder;
                result = i + 1;
            }
        }

        return result;



    }

    public static void main(String[] args) {
        raisingPower(List.of());
    }
}
