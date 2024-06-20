package com.axone.devintest.calc;

public class Addition {


    public int addition(int a,int b){
        int result = a+b;
        System.out.println("The sum of 2 numbers :"+ result);
        return result;
    }

    public static void main(String[] args) {
        Addition a  = new Addition();
        a.addition(30,40);
    }

}
