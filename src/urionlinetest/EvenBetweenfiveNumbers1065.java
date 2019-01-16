
package urionlinetest;

import java.util.Scanner;

public class EvenBetweenfiveNumbers1065 {
    public static void main(String[] args) {
        int a;
        int b = 0;
        int i;
        Scanner input = new Scanner(System.in);
        
        for(i = 0; i < 5; i++){
            a = input.nextInt();
            if(a%2==0)b++;
        }
        System.out.printf("%d valores pares\n",b);
    }
    
}
