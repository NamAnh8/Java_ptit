/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02006_Hop_cua_hai_day_so {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m], f = new int[1005];
        for(int i = 0; i < n; ++i)
        {
            a[i] = sc.nextInt();
            f[a[i]]++;
        }
        for(int i = 0; i < m; ++i)
        {
            b[i] = sc.nextInt();
            f[b[i]]++;
        }
        for(int i = 1; i <= 1000; ++i)
            if(f[i] > 0)
                System.out.print(i + " ");
    }
}
