
package urionlinetest;

import java.util.Scanner;

public class Interval1037 {
    public static void main(String[] args) {
        float i;
        Scanner input = new Scanner(System.in);
        i = input.nextFloat();
        if(i>=0 && i<=25.0000)
            System.out.printf("Intervalo [0,25]\n");
        else if(i>=25.00001 && i<=50.0000000)
            System.out.printf("Intervalo (25,50]\n");
        else if(i>=50.00000001 && i<=75.0000000)
            System.out.printf("Intervalo (50,75]\n");
        else if(i>=75.00000001 && i<=100.0000000)
            System.out.printf("Intervalo (75,100]\n");
        else
            System.out.printf("Fora de intervalo\n");
    }
    
}
