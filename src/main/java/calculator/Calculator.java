package calculator;

public class Calculator {
    public double calculate(Operation o, double n1, double n2) {
        return o.perform(n1, n2);
    }
}
