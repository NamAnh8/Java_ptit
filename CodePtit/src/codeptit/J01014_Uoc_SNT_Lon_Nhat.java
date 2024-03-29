/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01014_Uoc_SNT_Lon_Nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long res = -1;
            for(int i =2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    res = Math.max(res, i);
                    while(n % i == 0) n /= i;
                }
            }
            if(n > 1) res = Math.max(res, n);
            System.out.println(res);
        }
    }
}
