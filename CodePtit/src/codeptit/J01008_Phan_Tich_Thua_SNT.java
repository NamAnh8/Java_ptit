/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01008_Phan_Tich_Thua_SNT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(t-- > 0){
            i++;
            int n = sc.nextInt();
            System.out.print("Test" + " " + i + ":");
            for(int j = 2; j <= Math.sqrt(n); j++){
                if(n % j == 0){
                    int cnt = 0;
                    while(n % j == 0){
                        cnt++;
                        n /= j;
                    }
                    System.out.print(" "+ j + "(" + cnt + ") ");
                }
            }
            if(n > 1) System.out.print(" " + n + "(1)");
            System.out.println();
        }
    }
}
