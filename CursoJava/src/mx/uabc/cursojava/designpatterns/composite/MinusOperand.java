package mx.uabc.cursojava.designpatterns.composite;

class MinusOperand extends ArithmeticOperand
{
    public MinusOperand(ArithmeticComposite left,
                        ArithmeticComposite right)
    {
        super(left, right);
    }
    public int getValue()
    {
        return left.getValue() - right.getValue();
    }
}