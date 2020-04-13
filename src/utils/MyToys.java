/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author sonho
 */
public class MyToys {

    //cF: compute factorial, tinh n! =1.2.3...n
    //0!=1
    //n! tang nhanh lam nen de kieu long
    public static long cF(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Sorry! n must >= 0");
        }
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 0; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
