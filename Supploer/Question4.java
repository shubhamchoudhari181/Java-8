package com.java8.Pracice.Supploer;

import java.util.Random;
import java.util.function.Supplier;

//4.  Write a supplier to generate OTP (6-digit random number).
public class Question4 {
    public static void main(String[] args) {
        Supplier<Long> otp=()->{
            Random rand=new Random();
            Long otp1=100000+rand.nextLong(900000);
            return otp1;
        };
        System.out.println(otp.get());
    }
}
