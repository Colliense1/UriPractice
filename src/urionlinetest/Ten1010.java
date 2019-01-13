
package urionlinetest;

import java.util.Scanner;

public class Ten1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p1,p2;
        int u1,u2;
        float price1,price2,Total;
        
        p1 = input.nextInt();
        u1 = input.nextInt();
        price1=input.nextFloat();
        
        p2 = input.nextInt();
        u2 = input.nextInt();
        price2=input.nextFloat();
        
        Total = (u1*price1)+(u2*price2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",Total);
    }
    
}
