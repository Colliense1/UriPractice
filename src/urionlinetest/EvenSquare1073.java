
package urionlinetest;

import java.util.Scanner;

public class EvenSquare1073 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        Scanner input =new Scanner(System.in);
        j = input.nextInt();
        for (i = 2;i <= j;i+=2){
            k = i*i;
            System.out.printf("%d^2 = %d\n",i,k);
        }
    }
    
}
