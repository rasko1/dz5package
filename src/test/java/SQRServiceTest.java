import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;
public class SQRServiceTest     {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRService.csv")
    public void numberOfRoots(int expected, int beginningRange, int endRange) {
        SQRService service = new SQRService();

        int actual = service.searchForSquares(beginningRange, endRange);

        Assertions.assertEquals(expected, actual);
    }
}
