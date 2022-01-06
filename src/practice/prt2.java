package practice;

import java.util.Random;
import java.util.Scanner;

public class prt2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите внести");

        int[] data = new int[console.nextInt()];

        Random rnd = new Random();

        for (int i = 0; i < data.length; i++) {
            System.out.println("введите число");
            data[i] = console.nextInt();
        }

        System.out.println("*****");
        printArray(data);

        for (int i = 0; i < data.length; i++) {
            data[i] += 10;
        }

        System.out.println("*****");
        printArray(data);
    }
    //Сделать так чтобы в конце небыло запятой с пробелом
    //цикл должен быть foreach
    public static void printArray(int[] arr){
        System.out.print("[");
        int i = 0;
        for (int item : arr){
            System.out.print(item);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
            i++;
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            if(i != arr.length - 1){
//                System.out.print(", ");
//            }
//        }
        System.out.print("]\n");
    }
}
