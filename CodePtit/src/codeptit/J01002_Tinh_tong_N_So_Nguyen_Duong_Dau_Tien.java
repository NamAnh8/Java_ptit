/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

public class J01002_Tinh_tong_N_So_Nguyen_Duong_Dau_Tien {
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           long n;
           while(t-- > 0){
               n = sc.nextLong();
               System.out.println(n * (n + 1) / 2);
           }
       }   
}
