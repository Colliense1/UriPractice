
package urionlinetest;

import java.util.Scanner;

public class CoordinatesofaPoint1041 {
    public static void main(String[] args) {
        float x;
        float y;
        Scanner input = new Scanner(System.in);
        x = input.nextFloat();
        y = input.nextFloat();
        if(x == 0.0){
            if(y == 0.0)
            System.out.printf("Origem\n");
        else
            System.out.printf("Exio Y\n");
        }
        else if(y == 0.0){
            if(x == 0.0)
                System.out.printf("Origem\n");
        else
            System.out.printf("Exio X\n");
        }
        else if(x>0.0 && y>0.0){
            System.out.printf("Q1\n");
        }
        else if(x<0.0 && y>0.0){
            System.out.printf("Q2\n");
        }
        else if(x<0.0 && y<0.0){
            System.out.printf("Q3\n");
        }
        else if(x>0.0 && y<0.0){
            System.out.printf("Q4\n");
        }
            
    }
    
}
