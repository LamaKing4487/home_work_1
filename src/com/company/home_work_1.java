package com.company;

public class home_work_1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        System.out.println(~a); //-101011
        System.out.println(~b); //-10000
        System.out.println(a & b); //1010
        System.out.println(a | b); //101111
        System.out.println(a ^ b); //100101
        int c = (a << b);
        int z = (a >> b);
        System.out.println(c); //101010000000000000000
        System.out.println(z); //получаем ноль т.к. не можем сдвинуть влево на 42 число 15
        int q = (a >>> b);
        System.out.println(q);
        System.out.println(a &= b); //1010
        System.out.println(a |= b); //1111
        System.out.println(a ^= b);
        System.out.println(a >>= b);
        System.out.println(a <<= b);
    }

}
