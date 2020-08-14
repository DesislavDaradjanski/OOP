package Interface;


// 1729 -> 9271

public class DigitSequence implements  IntSequence{

    private  int digit;

    public DigitSequence(int digit) {
        this.digit = digit;
    }

    @Override
    public boolean hasNext() {

        return digit !=0;
    }

    @Override
    public double next() {
        int i = digit %10;
        digit/=10;
        return 0;
    }
}
