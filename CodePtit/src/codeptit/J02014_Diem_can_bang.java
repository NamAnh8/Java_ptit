/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02014_Diem_can_bang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sum = 0;
            int a[] = new int[n + 5];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            sum -= a[0];
            int tong = 0;
            boolean check = false;
            for(int i = 1; i < n; i++){
                tong += a[i - 1];
                sum -= a[i];
                if(sum == tong){
                    System.out.println(i + 1);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
