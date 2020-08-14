package Interface;

public class SquareSequence implements IntSequence{


    private int n;

    @Override
   public boolean hasNext() {
        return true;
    }

    @Override
    public double next() {
        // 1 -> 1 ^ 2 == 1
        // 2 -> 2 ^ 2 == 4
        // 3 -> 3 ^ 2 == 9
        // n -> n ^ 2 ==

        ++n;
        return n * n;
    }
}
