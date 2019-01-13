
package urionlinetest;

import java.util.Scanner;

public class Snack1038 {
    public static void main(String[] args) {
        int X;
        int Y;
        float snack;
        double array[] = {4.00,4.50,5.00,2.00,1.50};
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        Y = input.nextInt();
        snack = (float) (array[X-1]*Y);
        System.out.printf("Total: R$ %.2f\n",snack);
    }
    
}
