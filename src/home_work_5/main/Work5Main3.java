package home_work_5.main;
import home_work_5.service.Work5Service2;
import home_work_5.service.Work5Service3;
import home_work_5.service.engine.EasySearch;
public class Work5Main3 {
    public static void main(String[] args) {
        Work5Service3 service = new Work5Service3();
        service.run(new EasySearch(), "src/home_work_5/books/");
    }
}
