/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J03008_So_dep_3 {
    static String solve(String s){
        for (int i = 0; i < s.length(); ++i)
        {
            Character c = s.charAt(i);
            if (c != '2' && c != '3' && c != '5' && c != '7')
                return "NO";
        }
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}
