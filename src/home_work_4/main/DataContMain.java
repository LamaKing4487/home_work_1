package home_work_4.main;
import home_work_4.dto.Data;
import home_work_4.service_comparator.Datacomparator;
import java.util.Arrays;
import java.util.Comparator;

public class DataContMain {
    public static void main(String[] args) {
        Integer[] data = {1,77, null, null, 555,null, null, null, 888};
        Data <Integer> container =new Data(data);

        int index1 = container.add(1);
        int index2 = container.add(33);
        int index3 = container.add(8633);
        int index4 = container.add(964);
        System.out.println("index1= " + index1);
        System.out.println("index2= " + index2);
        System.out.println("index3= " + index3);
        System.out.println("index4= " + index4);

        int element1 = container.get(index1);
        int element2 = container.get(index2);
        int element3 = container.get(index3);
        int element4 = container.get(index4);
        System.out.println("element1=" + element1);
        System.out.println("element2= " + element2);
        System.out.println("element3= " + element3);
        System.out.println("element4= " + element4);

        System.out.println("array = " + Arrays.toString(container.getItems()));
        //System.out.println(container);

        container.delete(2);
        System.out.println("после удаления по индексу = " + Arrays.toString(container.getItems()));

        container.deleteItem(77);
        System.out.println("после удаления по элементу = " + Arrays.toString(container.getItems()));

        // почему???
        Comparator<Integer> comparator = new Datacomparator();
        container.sort(comparator);
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container);


    }
}
