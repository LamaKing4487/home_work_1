package home_work_5.main;
import home_work_5.service.Work5Service2;
import home_work_5.service.engine.EasySearch;

public class Work5Main2 {
    public static void main(String[] args) {
        Work5Service2 service = new Work5Service2();
        service.run(new EasySearch());
    }
}
