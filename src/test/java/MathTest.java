import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    public void testSum(){
        Math math = new Math();
        int res = math.sum(5, 7);
        assert res == 12 : "Сложение не работает";
    }
}
