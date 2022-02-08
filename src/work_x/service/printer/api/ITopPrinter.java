package work_x.service.printer.api;

import java.util.Comparator;
import java.util.List;

public interface ITopPrinter<T> {
    void print(List<T> data, Comparator<T> comparator);
}
