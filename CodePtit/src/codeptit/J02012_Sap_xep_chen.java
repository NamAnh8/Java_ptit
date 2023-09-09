/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02012_Sap_xep_chen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int b[] = new int[n + 5];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i)
        {
            a.add(b[i]);
            System.out.print("Buoc " + i + ": ");
            Collections.sort(a);
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
