import HomeWork10.tree.Tuna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
    Tuna tuna = new Tuna();
    @Test
    @DisplayName("Проверить что метод getNumberOfScales(), возвращает 91")
    void test(){
        Assertions.assertEquals(tuna.getNumberOfScales(),91);
    }
}
