package LoopsI;

import java.util.Scanner;

public class JavaLoopSolution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int multiplication =0;
        for(int i=1; i<=10; i++){
            multiplication = N*i;
           // System.out.println(N+" X " +i+ " = "+ multiplication );
            System.out.printf("%d x %d = %d \n", N, i, multiplication);
        }

        scanner.close();
    }
}
