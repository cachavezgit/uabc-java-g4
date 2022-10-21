package mx.uabc.cursojava.designpatterns.composite;

class PlusOperand extends ArithmeticOperand
{
    public PlusOperand(ArithmeticComposite left,
                       ArithmeticComposite right)
    {
        super(left, right);
    }
    public int getValue()
    {
        return left.getValue() + right.getValue();
    }
}