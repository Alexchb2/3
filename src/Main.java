public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int paymentOneYear = service.calculate(1, 1_000_000, 9.99);
        System.out.println("Ежемесячный платеж: " + paymentOneYear);

        int paymentTwoYears = service.calculate(2, 1_000_000, 9.99);
        System.out.println("Ежемесячный платеж: " + paymentTwoYears);

        int paymentThreeYears = service.calculate(3, 1_000_000, 9.99);
        System.out.println("Ежемесячный платеж: " + paymentThreeYears);

    }
}
