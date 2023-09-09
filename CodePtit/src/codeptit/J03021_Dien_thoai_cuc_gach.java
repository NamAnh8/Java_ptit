/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

public class J03021_Dien_thoai_cuc_gach {
    static String Char(Character c){
        if(c <= 'c') return "2";
        else if(c <= 'f') return "3";
        else if(c <= 'i') return "4";
        else if(c <= 'l') return "5";
        else if(c <= 'o') return "6";
        else if(c <= 's') return "7";
        else if(c <= 'v') return "8";
        return "9";
    }
    static String check(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine().toLowerCase();
            String s = "";
            for(int i = 0; i < a.length(); i++){
                s += Char(a.charAt(i));
            }
            System.out.println(check(s));
        }
    }
}
