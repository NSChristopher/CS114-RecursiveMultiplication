import java.util.Scanner;

public class RecursiveMultiply {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();

        long result = Multiply(a,b);

        System.out.println((long)result);
    }

    public static long Multiply(long a, long b)
    {
        // 15*20 = 20 + 14*20 = 20 + 7*2*20 = 20 + 7

        if (a == 1)
            return b;
        if (a % 2 == 0) {
            return Multiply(a/2, b + b);
        }
        return (Multiply(a/2, b + b) + b);
    }
}