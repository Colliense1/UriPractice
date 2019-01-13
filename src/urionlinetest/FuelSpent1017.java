
package urionlinetest;

import java.util.Scanner;

public class FuelSpent1017 {
    public static void main(String[] args) {
        
        int i;
        int j;
        double x;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        j = input.nextInt();
        
        x = (i*j)/12.0;
        System.out.printf("%.3f\n",x);
        
    }
    
}
