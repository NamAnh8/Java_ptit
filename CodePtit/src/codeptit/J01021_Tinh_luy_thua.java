/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01021_Tinh_luy_thua {
    static int mod = (int)1e9 + 7;
    static long solve(long a, long b){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1) res = res * a % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        long a = sc.nextLong();
        long b= sc.nextLong();
        if(a == 0 && b == 0) break;
        System.out.println(solve(a, b));
        }
    }
}
