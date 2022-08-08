public class CreditPaymentService {

    public int calculate(int year, int cost, double percent) {
        double p = percent / 100 / 12;
        int n = year * 12;
        double formula = cost * p / (1 - Math.pow(1 + p, -n));
        int formulaInt = (int) formula;
        return formulaInt;
    }
}