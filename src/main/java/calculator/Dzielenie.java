package calculator;

public class Dzielenie implements Operation {
    public double perform(double n1, double n2) {
        if (n2 != 0) {
        return n1 / n2;} else {throw new IllegalArgumentException("nie dzielimy przez zero");}
    }
}
