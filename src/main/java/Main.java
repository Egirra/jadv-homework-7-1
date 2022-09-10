public class Main {

    public static void main(String[] args) {
        double loan = 50_000;
        int months = 6;
        double rate = 0.12;
        CreditCalculator calculator = new CreditCalculatorImpl();

        System.out.println("Ежемесячный платеж: " + calculator.calcMonthlyPayment(loan, rate, months));
        System.out.println("Общая сумма к возврату в банк: " + calculator.calcTotalSum(loan, rate, months));
        System.out.println("Переплата за весь период: " + calculator.calcOverpayment(loan, rate, months));
    }
}
