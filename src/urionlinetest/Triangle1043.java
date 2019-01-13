
package urionlinetest;

import java.util.Scanner;

public class Triangle1043 {
    public static void main(String[] args) {
        float A;
        float B;
        float C;
        float sum;
        float area;
        Scanner input = new Scanner(System.in);
        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();
        if(A+B > C && B+C > A && A+C > B){
            sum = A+B+C;
            System.out.printf("Perimetro = %.1f\n",sum);
            
        }else{
            area = ((A + B )* C)/2;
            System.out.printf("Area = %.1f\n",area);
            
        }
    }
    
}
