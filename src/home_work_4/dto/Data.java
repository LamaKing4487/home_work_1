package home_work_4.dto;
import java.util.Arrays;
import java.util.Comparator;

public class Data <T>{
    private T [] data;

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public Data(T[] data) {
        this.data = data;
    }
    public int add (T item) {
        for (int i = 0; i < data.length; i++) {
            if (item == null) {
                return -1;
            }
            else if ( data [i] == null) {
                data [i] = item;
                return i;
            }
        }

        T [] dataNew = Arrays.copyOf(data,data.length+1);
        dataNew [data.length]=item;
        this.data=dataNew;
        return data.length-1;
    }
    public T get (int index) {
        if (index >= data.length || index < 0) {
            return null;
        }
        return data[index];
    }

        public T [] getItems () {
            return data;
        }
    public boolean delete (int index) {
        if (index >= data.length || index < 0) {
            return false;
        }
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        T[] dataNew2 = Arrays.copyOf(data, data.length - 1);
        this.data = dataNew2;
        return true;
    }
    public boolean deleteItem (T item) {
        for (int i = 0; i < data.length; i++) {
            if ( data [i].equals(item)) {
                for (int j = i; j <data.length-1 ; j++) {
                    data [j] = data [j+1];
                }
                T [] dataNew3 = Arrays.copyOf(data,data.length-1);
                this.data=dataNew3;
                return true;
            }
        }
        return false;
    }
    public void sort (Comparator<T> comparator) {
        boolean isSorted = false;
        T a;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (comparator.compare(data[i], data[i + 1]) > 0) {
                    isSorted = false;

                    a = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = a;
                }
            }
        }
    }
    @Override
    public String toString() {
        for (int i = 0; i < data.length; i++) {
            if (data [i] == null) {
                for (int j = i; j < data.length-1; j++) {
                    data [j] = data[j+1];
                }
                T [] dataNew3 = Arrays.copyOf(data,data.length-1);
                this.data=dataNew3;
                i--;
            }
        }
        return "DataContainer{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

}
