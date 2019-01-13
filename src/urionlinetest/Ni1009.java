
package urionlinetest;

import java.util.Scanner;

public class Ni1009 {
    public static void main(String[] args) {
        
        String name;
        double A;
        double B;
        double TOTAL;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
        System.out.print("");
        A = input.nextDouble();
        
        System.out.print("");
        B = input.nextDouble();
        
        TOTAL = A+(B*15)/100;
       
        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
        
        
        
    }
    
}
