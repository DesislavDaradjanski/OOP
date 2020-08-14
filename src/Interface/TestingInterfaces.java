package Interface;

public class TestingInterfaces {
    // средно аритметично на първите n числа
// от дадена последователност от числа
    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }
    public static void main(String[] args) {
       // IntSequence seq = new SquareSequence();
        IntSequence seq2 = new DigitSequence(235);
// средно аритметично на първите 10 числа
       // double average = average(seq, 5);
      //  System.out.println(average);
        // 1, 4, 9, 16, 25
        double s = average(seq2,5);
        System.out.println(seq2);
    }
}
