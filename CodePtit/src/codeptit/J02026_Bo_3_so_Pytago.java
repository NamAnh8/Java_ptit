/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

public class J02026_Bo_3_so_Pytago{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), ok = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    long k = (long) Math.sqrt(a[i] * a[i] + a[j] * a[j]);
                    if (k * k != a[i] * a[i] + a[j] * a[j]) {
                        break;
                    }
                    if (Arrays.binarySearch(a, k) > j) {
                        ok = 1;
                        break;
                    }
                }
            }
            System.out.println(ok == 1 ? "YES" : "NO");
        }
    }
}
