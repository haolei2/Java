

import java.util.Scanner;

public class Main {
    final static long num1 = 3;
    final static long num2 = 6;
    final static long num3 = 69;
    final static long num4 = 180;
    private static long  getTrible(long num){
        return num*num*num;
    }

    public static void main(String[] args) {
	// write your code here
        long equalSum1 = 0;
        for(int i = 0;i < 3;i++) {
            equalSum1 += getTrible(num1+i);
        }

        System.out.println(equalSum1 == getTrible(num2));

        long equalSum2 = 0;
        for(long i = num2;i <= num3;i++) {
            equalSum2 += getTrible(i);
        }

        System.out.println(equalSum2 == getTrible(num4));

        long sum = 0;
        System.out.println("please Input a number(scope:1-j):");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int[] list = new int[j+1];
        for(int i = 1;i<=j;i++)
            list[i] = i*i*i;

        for(;j>=2;j--){
            for(int i = 1;i<j;i++){
                for(int k = i;k <=j;k++ ){
                    sum += list[k];
                }

                int tmp = (int)Math.cbrt(sum);
                if(Math.abs(Math.cbrt(sum) - (int)Math.cbrt(sum)) < 1.e-7 ){
                    for(int k = i;k < j;k++){
                        System.out.print(k+"^3 + ");
                    }
                    System.out.println(j+"^3 = " + tmp +"^3");
                }
                sum = 0;
            }
        }

    }
}
