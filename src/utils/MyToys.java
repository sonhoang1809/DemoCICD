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
    
    //public static long cF(int n) {
    //    if (n < 0 || n > 15) {
    //        throw new IllegalArgumentException("Sorry! n must >= 0");
    //    }
    //    if (n == 0) {
    //        return 1;
    //    } else {
    //        long result = 1;
    //        for (int i = 1; i <= n; i++) {
    //            result *= i;
    //        }
    //        return result;
    //    }
    //}
    public static long cF(int n){
        if (n < 0 || n > 15) {
           throw new IllegalArgumentException("Sorry! n must >= 0");
        }
        if(n==0){
            return 1;
        }else{
            return n*cF(n-1);
        }
    }
    
    //mọi đoạn code bạn viết ra, phải cố gắng đảm bảo rằng nó có chất lượng
    //chất lượng nghĩa là: hàm trả về, xử lý đúng như mình dự kiến, kì vọng 
    //expected 
    //ví dụ cF(5) thì phải trả về 120
    //vậy ta phải cb bộ test cho từng hàm, đảm bảo nó xử lý đúng
    //từng hàm xử lý đúng -> class xử lý đúng
    //việc đảm bảo cho từng class/module/ từng hàm chạy như dự kiến
    //developer có trách nhiệm này, việc này song song viết code
    //quá trình này gọi là UNIT testing
    //làm s để test hàm chạy đúng k
    //cb data -> đưa data -> gọi hàm-> nhìn kq-> so với dự kiến
    //nhìn kq: mắt (nhìn con số trả ra, so với con số mong đợi)
    //nhìn màu, màu xanh, màu đỏ
    //mắt -> sout(), JOptionPane, log,...
    //màu -> JUnit, TestNG,...

}
