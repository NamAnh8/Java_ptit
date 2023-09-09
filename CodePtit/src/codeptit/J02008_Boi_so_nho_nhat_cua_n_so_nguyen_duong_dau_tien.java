/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02008_Boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] LCM = new long[105];
        LCM[1] = 1;
        LCM[2] = 2;
        for(int i = 3; i <= 100; i++){
            LCM[i] = (long) i * LCM[i - 1] / gcd((long) i, LCM[i - 1]);
        }
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(LCM[n]);
        }
    }
}
