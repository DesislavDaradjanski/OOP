import java.util.Scanner;

public class x99bottles {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        //int bottles = in.nextInt();

        int b= 99;
        int b1 =b;
        while ( b>0){
            if (b>1){
                System.out.printf("%d bottles of beer on the wall,%d bottles of beer.%n" +
                        "Take one down and pass it around,%d bottles of beer on the wall.%n%n",b,b,b-1);
            }

            if (b == 1){
                System.out.printf("%d bottle of beer on the wall,%d bottle of beer.%n"+
                        "Take it down and pass it around, no more bottles of beer on the wall.%n%n",b,b);
            }
            --b;
        }
        if (b==0){
            System.out.printf("No more bottles of beer on the wall, no more bottles of beer.%n" +
                    "Go to the store and buy some more,%d bottles of beer on the wall.",b1);
        }

    }
}
