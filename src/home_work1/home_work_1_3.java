package home_work1;

public class home_work_1_3 {
    public static void main(String[] args) {
        int a = -42;
        int b = -15;
        System.out.println(~a); //101001
        System.out.println(~b); //1110
        System.out.println(a&b); //-110000
        System.out.println(a | b); //-1001
        System.out.println(a ^ b); //100111
        int c = (a << b);
        int z = (a >> b);
        System.out.println(c); //-10101000000000000000000
        System.out.println(z); //-1
        int q = (a >>> b);
        System.out.println(q); //111111111111111
        System.out.println(a &= b); //-110000
        System.out.println(a |= b); //-1111
        System.out.println(a ^= b);
        System.out.println(a >>= b);
        System.out.println(a <<= b);
    }
}
