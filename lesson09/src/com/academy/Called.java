package com.academy;

public class Called {
//    public void m1(String a){
//        System.out.println("Som string");
//    }
//
//    public void m1(int a, String b, int... c){
//        //warargs iba na KONCI!!!!
//        System.out.println("Som int");
//        for(int i=0;i<c.length;i++){
//            System.out.println(c[i]);
//        }
//    }

    //v poradi compability
    //vola najprv
    public void m1(int a){
        System.out.println("Som int");
    }
    //vola ako druhy lebo je to int s L pridanim
    public void m1(long a){
        System.out.println("Som long");
    }
    //vola sa ako treti
    public void m1(Integer a){
        System.out.println("Som wrapper");
    }
    //vola sa ako stvrty
    public void m1(int... a){
        System.out.println("som warargs");
    }
}
