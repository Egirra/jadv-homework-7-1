public interface CreditCalculator {
    double calcMonthlyPayment(double loan, double rate, int months);
    double calcTotalSum(double loan, double rate, int months);
    double calcOverpayment(double loan, double rate, int months);
}
