package home_work_5.test.service.engine;
import home_work_5.service.engine.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class EasySearchTest {
    private final EasySearch engine = new EasySearch();

    @Test
    public void test1(){
        long count = engine.search("привет, как дела!", "привет");

        Assertions.assertEquals(1, count);
    }


    @Test
    public void test2(){
        long count = engine.search("привет, привет!", "привет");

        Assertions.assertEquals(2, count);
    }


    @Test
    public void test3(){
        long count = engine.search("привет-привет!", "привет");

        Assertions.assertEquals(0, count);
    }
}
