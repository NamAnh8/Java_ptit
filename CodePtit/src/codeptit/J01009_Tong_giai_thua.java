/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01009_Tong_giai_thua {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] gt = new long[30];
        gt[1] = 1;
        for(int i = 2; i <= 28; i++){
            gt[i] = i * gt[i - 1];
        }
        long sum = 0;
        int n  =sc.nextInt();
        for(int i = 1; i <= n; i++){
            sum += gt[i];
        }
        System.out.print(sum);
    }
}
