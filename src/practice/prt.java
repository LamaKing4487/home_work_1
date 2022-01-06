package practice;

import java.util.Scanner;
import java.util.SortedMap;

public class prt {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.println("введи");

        int[] data = new int[console.nextInt()];


        for (int i = 0; i < data.length; i++) {
            System.out.println("введите число");
            data[i] = console.nextInt();

        }
        int sum = 0;
        for (int item : data) {
            sum += item;



        }
        System.out.println(sum);
       }


}

