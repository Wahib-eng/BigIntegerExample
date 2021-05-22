package com.withWahib;
import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        BigInteger a =new BigInteger(128,7,new Random());
        BigInteger b =new BigInteger(128,7,new Random());
        BigInteger c=a.multiply(b);
        BigInteger bir=new BigInteger("1");
        BigInteger d=a.subtract(bir).multiply(b.subtract(bir));
        BigInteger e;

        System.out.println(a);
        System.out.println(b);
    }

}

