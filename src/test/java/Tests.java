import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
    final double LOAN = 50_000;
    final int MONTHS = 6;
    final double RATE = 0.12;
    CreditCalculator calculator = new CreditCalculatorImpl();

    @Test
    @DisplayName("Успешный расчет ежемесячного платежа")
    void monthlyPayment() {
        double expectedMonthlyPayment = LOAN / MONTHS + LOAN * RATE;
        double reality = calculator.calcMonthlyPayment(LOAN, RATE, MONTHS);
        Assertions.assertEquals(expectedMonthlyPayment, reality);
    }

    @Test
    @DisplayName("Успешный расчет суммы возврата")
    void totalSum() {
        double expectedTotalSum = LOAN + LOAN * RATE / 12 * MONTHS;
        double reality = calculator.calcTotalSum(LOAN, RATE, MONTHS);
        Assertions.assertEquals(expectedTotalSum, reality);
    }

    @Test
    @DisplayName("Успешный расчет переплаты")
    void Overpayment() {
        double expectedOverpayment = LOAN * RATE / 12 * MONTHS;
        double reality = calculator.calcOverpayment(LOAN, RATE, MONTHS);
        Assertions.assertEquals(expectedOverpayment, reality);
    }
}
