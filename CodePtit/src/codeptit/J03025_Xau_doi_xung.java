/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J03025_Xau_doi_xung{
    static String solve(String s){
        int cnt = 0;
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) cnt++;
        }
        if((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 != 0 && cnt <= 1))
            return "YES";
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}
