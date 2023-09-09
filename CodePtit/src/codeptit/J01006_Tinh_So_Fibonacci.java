/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01006_Tinh_So_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fibo = new long[95];
        fibo[1] = fibo[2] = 1;
        for(int i = 3; i <= 92; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }
}
