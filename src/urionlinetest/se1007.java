
package urionlinetest;

import java.util.Scanner;

public class se1007 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;
        Scanner input = new Scanner (System.in);
        System.out.print("");
        A = input.nextInt();
        
        System.out.print("");
        B = input.nextInt();
        
        System.out.print("");
        C = input.nextInt();
        
        System.out.print("");
        D = input.nextInt();
        
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
    
}
