package mx.uabc.cursojava.designpatterns.composite;

public class PruebaComposite {
    public static void main(String[] args) {
        ArithmeticComposite expr = new MinusOperand(
                new PlusOperand(new NumericValue(1), new NumericValue(4)),
                new NumericValue(2));

        ArithmeticComposite expr2 = new PlusOperand(new NumericValue(100), new NumericValue(200));

        System.out.println(String.format("Value equals %d", expr.getValue()));
        System.out.println(String.format("Value equals %d", expr2.getValue()));
    }
}
