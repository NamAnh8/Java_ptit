/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J03040_Bien_so_dep {
    public static boolean solve1(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) >= s.charAt(i + 1)) return false;
        }
        return true;
    }
    public static boolean solve2(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }
    public static boolean solve3(String s){
        return solve2(s.substring(0, 2)) && solve2(s.substring(3));
    }
    public static boolean solve4(String s){
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine().trim().substring(5);
            s = s.substring(0, 3) + s.substring(4);
            if(solve1(s) || solve2(s) || solve3(s) || solve4(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
