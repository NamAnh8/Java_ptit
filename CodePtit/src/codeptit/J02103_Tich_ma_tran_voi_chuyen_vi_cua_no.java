/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02103_Tich_ma_tran_voi_chuyen_vi_cua_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                   b[j][i] = a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + (t + 1) +":" );
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int res = 0;
                    for(int z = 0; z < m; z++){
                        res += a[i][z] * b[z][j];
                    }
                    System.out.print(res + " ");
                }
                System.out.println();
            }
        }
    }
}
