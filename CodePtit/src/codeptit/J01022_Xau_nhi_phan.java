/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01022_Xau_nhi_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] dp = new long[100];
        dp[1] = dp[2] = 1;
        for(int i = 3; i <= 95; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        long k;
        int n;
        String s = "001";
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextLong();
            while(n > 2){
                if(k <= dp[n - 2]) n -= 2;
                else{
                    k -= dp[n - 2];
                    n--;
                }
            }
            System.out.println(s.charAt(n));
        }
    }
}
