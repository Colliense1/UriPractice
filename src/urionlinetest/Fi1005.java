
package urionlinetest;

import java.util.Scanner;

public class Fi1005 {
    
    public static void main(String[] args) {
        
        double A;
        double B;
        double MEDIA;
        
        Scanner input = new Scanner (System.in);
        System.out.print("");
        A = input.nextDouble();
        
        System.out.print("");
        B = input.nextDouble();
        MEDIA = (A*3.5+B*7.5)/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
    
}
