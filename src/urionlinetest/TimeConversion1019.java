
package urionlinetest;

import java.util.Scanner;

public class TimeConversion1019 {
    public static void main(String[] args) {
        int hr;
        int min;
        int sec;
        int N;
        Scanner input = new Scanner(System.in);
        N   = input.nextInt();
        hr  = N / 3600;
        N   = N % 3600;
        min = N / 60;
        sec = N % 60;
        System.out.printf("%d:%d:%d\n",hr,min,sec);
    }
    
}
