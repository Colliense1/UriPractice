
package urionlinetest;

import java.util.Scanner;

public class Consumption1014 {
    public static void main(String[] args) {
        int X;
        double a;
        float Y;
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        Y = input.nextFloat();
        a = X/Y;
        System.out.printf("%.3f km/l\n",a);
       
        
    }
    
}
