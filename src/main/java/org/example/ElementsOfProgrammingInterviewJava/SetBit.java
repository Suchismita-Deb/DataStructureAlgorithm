package org.example.ElementsOfProgrammingInterviewJava;

public class SetBit {
    public static void main(String[] args){
        // Count number of bit that are set.
        int x=4;
        System.out.println(x>>1);//2
        // Binary representation of a decimal number.
        System.out.println(Integer.toBinaryString(x>>1));//10

        System.out.println(x<<1);// 8.
        // Left shift means multiply by 2.
        // Right shift means divide by 2.

        // We can do the shift for max 32 bits.
        System.out.println(x<<33);// 8
        // If more than 32 then it takes only the last 5 digit.
        System.out.println(Integer.toBinaryString(33));
        // Binary of 33 - 100001.
        // It will consider the last 5 bits - 00001.
        // So the value is 1. So x<<33 == x<<1.

        System.out.println(Integer.toBinaryString(-123));
        // 11111111111111111111111110000101
        System.out.println(x<<-123); // 128.
        // x<<5
        System.out.println(x<<5); // 128.
        System.out.println(-4<<1); // -8

        System.out.println(-4>>1); // -2.
        // Negative number is stored using 2's complement.

        System.out.println(Integer.toBinaryString(-4));
        // 11111111111111111111111111111100.

        System.out.println(Integer.toBinaryString(-4>>1));
        // 11111111111111111111111111111110

        // When right shift then it will check the left most bit and if it is one then after the right shift it will be one. For negative numbers it will be one and for positive numbers it will be 0.
        // New places bits depends on the left most bits.

        System.out.println(-4>>>1);
        // the left most bit will be filled with 0.
        // right shift filled with 0.
        // 2147483646
        System.out.println(Integer.toBinaryString(2147483646));
        // 1111111111111111111111111111110
  }
}
