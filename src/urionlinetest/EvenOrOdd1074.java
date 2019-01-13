
package urionlinetest;

import java.util.Scanner;

public class EvenOrOdd1074 {
    public static void main(String[] args) {
        int I;
        int N;
        int T;
        
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        for(I=0;I<T;I++){
            N = input.nextInt();
            if(N==0)
              System.out.println("NULL");
            else if(N>0){
                if(N%2 == 0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("ODD POSITIVE");
                }
            }
            else if(N<0){
                if(N%2 == 0){
                    System.out.println("EVEN NEGATIVE");
                    
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
            
        }
        
       
    }
    
}
