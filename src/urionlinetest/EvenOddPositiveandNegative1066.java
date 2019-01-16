
package urionlinetest;

import java.util.Scanner;

public class EvenOddPositiveandNegative1066 {
    public static void main(String[] args) {
        int i;
        int e = 0;
        int o = 0;
        int p = 0;
        int n = 0;
        int a;
        Scanner input = new Scanner(System.in);
        for(i = 0; i < 5; i++){
            a = input.nextInt();
            if(a%2 == 0)e++;
            else o++;
            if(a > 0)p++;
            else if(a < 0) n++;
        }
        System.out.printf("%d valor(es) par(es)\n",e);
        System.out.printf("%d valor(es) impar(es)\n",o);
        System.out.printf("%d valor(es) positivo(s)\n",p);
        System.out.printf("%d valor(es) negativo(s)\n",n);
    }
    
}
