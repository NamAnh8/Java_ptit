/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01007_Kiem_tra_so_fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fibo = new long[100];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i < 93; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        while(t-- > 0){
            int n = sc.nextInt();
            int idx = Arrays.binarySearch(fibo, 0, 92, n);
            if(idx < 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
