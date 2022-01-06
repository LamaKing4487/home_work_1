package practice;
import java.util.Random;
import java.util.Scanner;
public class prt2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите внести");

        int[][] data = new int[console.nextInt()][];

        Random rnd = new Random();

        System.out.println("*****");
        printArray(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println("введите размер ячейки" + i);
            data[i] = new int[console.nextInt()];
        }

        System.out.println("*****");
        printArray(data);
    }

    /**
     * Печать переданного массива в консоль
     * @param arr массив который будем печатать
     */
    public static void printArray(int[][] arr){
        System.out.print("[");
        int i = 0;
        for (int[] item : arr){
            printArray(item);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
            i++;
        }
        System.out.print("]\n");
    }

    public static void printArray(int[] arr){
        if(arr != null){
            System.out.print("[");
            int i = 0;
            for (int item : arr){
                System.out.print(item);
                if(i != arr.length - 1){
                    System.out.print(", ");
                }
                i++;
            }
            System.out.print("]");
        } else {
            System.out.print("null");
        }
    }
}
