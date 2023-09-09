/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02005_Giao_cua_hai_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] x = new int[a];
        int[] y = new int[b];
        int[] Px = new int[105];
        int[] Py = new int[105];
        for(int i = 0; i < a; i++){
            x[i] = sc.nextInt();
            Px[x[i]] = 1;
        }
        for(int i = 0; i < b; i++){
            y[i] = sc.nextInt();
            Py[y[i]] = 1;
        }
        int max = Math.max(a, b);
        for(int i = 1; i < max + 1; i++){
            if(Px[i] == 1 && Py[i] == 1){
                System.out.print(i + " ");
            }
        }
    }
}
