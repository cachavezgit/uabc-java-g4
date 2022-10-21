package mx.uabc.cursojava.designpatterns.composite;

class NumericValue implements ArithmeticComposite
{
    private int value;

    public NumericValue(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}