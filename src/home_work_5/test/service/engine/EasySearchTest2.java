package home_work_5.test.service.engine;
import home_work_5.service.engine.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.arguments;
public class EasySearchTest2 {
    private final EasySearch engine = new EasySearch();

    @ParameterizedTest
    @MethodSource("searchStrings")
    public void test(String text, String word, long result){
        long count = engine.search(text, word);

        Assertions.assertEquals(result, count);
    }

    public static Stream<Arguments> searchStrings() {
        return Stream.of(
                arguments("привет", "привет", 1L),
                arguments("привет, приветик", "привет", 1L),
                arguments("привет, как дела!", "привет", 1L),
                arguments("привет, привет!", "привет", 2L),
                arguments("привет-привет!", "привет", 0L)
        );
    }
}
