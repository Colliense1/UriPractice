
package urionlinetest;

import java.util.Scanner;

public class Interval21072 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int a = 0;
        int b = 0;
        
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        for (i = 0;i < j;i++){
            k = input.nextInt();
            if (k >= 10 && k <= 20)a++;
            else b++;
        }
        System.out.printf("%d in\n",a);
        System.out.printf("%d out\n",b);

    }
    
}
