
package urionlinetest;

import java.util.Scanner;

public class Si1006 {
    public static void main(String[] args) {
        double A;
        double B;
        double C;
        double MEDIA;
        Scanner input = new Scanner (System.in);
        
        System.out.print("");
        A = input.nextDouble();
        System.out.print("");
        B = input.nextDouble();
        System.out.print("");
        C = input.nextDouble();
        MEDIA = (A*2+B*3+C*5)/(2+3+5);
        System.out.printf("MEDIA = %.1f\n",MEDIA);
        
    }
    
}
