package home_work_2;
import java.util.Arrays;
public class home_work_4_2_1 {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] > opora) {
                i++;
            }
            while (array[j] < opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] mass = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(mass));
        int low = 0;
        int high = mass.length - 1;
        quickSort(mass, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(mass));
    }

}
