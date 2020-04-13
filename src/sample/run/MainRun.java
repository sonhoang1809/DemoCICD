/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.run;

import utils.MyToys;

/**
 *
 * @author sonho
 */
public class MainRun {
    public static void main(String[] args) {
        System.out.println("5! = "+ MyToys.cF(5));
        System.out.println("6! = "+ MyToys.cF(6));
        System.out.println("0! = "+ MyToys.cF(0));
        System.out.println("Exception: !"+MyToys.cF(-5));// ki vong bi chui sap mat, khi do jvm se giet app
    }
}
