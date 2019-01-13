
package urionlinetest;

import java.util.Scanner;

public class SixOddNumbers1070 {
    public static void main(String[] args) {
         int i;
         int X;
         Scanner input = new Scanner(System.in);
         X= input.nextInt();
         
         if(X%2 == 0)
                X++; 
         for(i = 0;i< 6;i++){
             System.out.println(X);
             X = X+2; 
            
         }
    }
    
}
