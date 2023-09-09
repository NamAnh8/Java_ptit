/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01013_Tong_Uoc_So {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2000005];
        a[0] = a[1] = 1;
        for(int i = 2; i <= 200000; i++){
            if(a[i] == 0){
                for(int j = i * i; j <= 2000000; j+=i){
                    if(a[j] == 0) a[j] = i;
                }
            }  
        }
        for(int i = 2; i <= 2000000; i++){
            if(a[i] == 0) a[i] = i;
        }
        long sum = 0;
        int n = sc.nextInt();
        int x;
        while(n-- > 0){
            x = sc.nextInt();
            while(x > 1){
                sum += a[x];
                x /= a[x];
            }
        }
        System.out.println(sum);
    }
}
