package africa;

import JavaMoney.JavaMoney;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JavaMoneyTest {
//    private final JavaMoney javaMoney = new JavaMoney();

    @Test
    public void testJavaMoney() {
        JavaMoney javaMoney = new JavaMoney();
        BigDecimal.amont = BigDecimal.valueof(5000);
        BigDecimal amountInNiara = converter.convert("USD", "NGN");
        boolean isAmountInRange = amountInNira.compareTo(BigDecimal.valueOf((7500000)))

    }

}
