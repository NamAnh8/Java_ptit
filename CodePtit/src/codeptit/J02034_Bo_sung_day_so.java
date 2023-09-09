/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02034_Bo_sung_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 5];
        int Pa[] = new int[205];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            Pa[a[i]] = 1;
        }
        int cnt = 0;
        for(int i = 1; i <= a[n - 1]; i++){
            if(Pa[i] == 0){
                System.out.println(i);
                cnt++;
            }
        }
        if(cnt == 0) System.out.println("Excellent!");
    }
}
