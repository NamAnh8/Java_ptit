/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02007_Dem_so_lan_xuat_hien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = 0;
        while(t-- > 0){
            s++;
            int n = sc.nextInt();
            int a[] = new int[n];
            int Pa[] = new int[10000];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                Pa[a[i]]++;
            }
            System.out.println("Test " + s + ":");
            for(int  i = 0; i < n; i++){
                if(Pa[a[i]] > 0){
                    System.out.println(a[i] + " xuat hien " + Pa[a[i]] + " lan");
                    Pa[a[i]] = 0;
                }
            }
        }
    }
}
