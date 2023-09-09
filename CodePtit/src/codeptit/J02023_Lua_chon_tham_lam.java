/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02023_Lua_chon_tham_lam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = sc.nextInt();
        String s1 = "";
        StringBuilder s = new StringBuilder(s1);
        boolean check = true;
        while(n-- > 0){
            if(S == 0){
                check = false;
                break;
            }
            if(S >= 9 ){
                s.append('9');
                S -= 9;
            }
            else{
                s .append(String.valueOf(S));
                S = 0;
            }
        }
        if(S != 0 || check == false ) System.out.print("-1 -1 ");
        else{
            StringBuilder reversedS = new StringBuilder(s).reverse();
            System.out.print(reversedS + " " + s);
        }
    }
}
