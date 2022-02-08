package home_work_5.main;
import home_work_5.service.Work5Service3;
import home_work_5.service.Work5Service4;
import home_work_5.service.engine.EasySearch;
public class Work5Main4 {
    public static void main(String[] args) {
        Work5Service4 service = new Work5Service4();
        service.run(new EasySearch(), "src/home_work_5/books/");
    }
}
