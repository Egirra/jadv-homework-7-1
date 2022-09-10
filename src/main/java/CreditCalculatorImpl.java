public class CreditCalculatorImpl implements CreditCalculator {
    @Override
    public double calcMonthlyPayment(double loan, double rate, int months) {
        return loan / months + loan * rate;
    }

    @Override
    public double calcTotalSum(double loan, double rate, int months) {
        return loan + loan * rate / 12 * months;
    }

    @Override
    public double calcOverpayment(double loan, double rate, int months) {
        return loan * rate / 12 * months;
    }
}
