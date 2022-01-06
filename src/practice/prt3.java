package practice;

import java.util.Scanner;

public class prt3 {
    public static void main(String[] args)
    {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Сумма четных чисел:"+sumE);
        System.out.println("Сумма нечетных чисел:"+sumO);
    }
}
