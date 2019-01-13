
package urionlinetest;

import java.util.Scanner;

public class Banknotes1018 {
    public static void main(String[] args) {
        int i;
        int j;
        int a;
        int arr[] ={100,50,20,10,5,2,1};
        int br[] = new int[7];
        Scanner input = new Scanner (System.in);
        a = input.nextInt();
        System.out.println(a);
        for(i = 0; i<7;i++){
            br[i] = a/arr[i];
            a = a % arr[i];
        }
        for(j=0;j<7;j++){
            System.out.printf("%d nota(s) de R$ %d,00\n",br[j],arr[j]);
            
        }
        
    }
    
}
