package mx.uabc.cursojava.designpatterns.composite;

abstract class ArithmeticOperand implements ArithmeticComposite
{
    protected ArithmeticComposite left;
    protected ArithmeticComposite right;

    public ArithmeticOperand(ArithmeticComposite left,
                              ArithmeticComposite right)
    {
        this.left = left;
        this.right = right;
    }
}