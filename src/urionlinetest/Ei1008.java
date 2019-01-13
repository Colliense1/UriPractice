
package urionlinetest;

import java.util.Scanner;

public class Ei1008 {
    
    public static void main(String[] args) {
        int NUMBER;
        int B;
        double P;
        double SALARY;
        
        Scanner input =new Scanner(System.in);
        NUMBER = input.nextInt();
        
        System.out.print("");
        B = input.nextInt();
        System.out.print("");
        P = input.nextDouble();
        SALARY = B*P;
        
        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
        
    }
    
}
