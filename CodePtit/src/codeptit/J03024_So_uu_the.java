/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J03024_So_uu_the {
    static String solve(String s){
        int cnt_odd = 0, cnt_even = 0;
        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i) - '0';
            if(num < 0 || num > 9) return "INVALID";
            else{
                if(num % 2 == 0) cnt_even++;
                else cnt_odd++;
            }
        }
        if(s.charAt(0) == '0') return "NO";
        if(cnt_even > cnt_odd && s.length() % 2 == 0) return "YES";
        if(cnt_odd > cnt_even && s.length() % 2 != 0) return "YES";
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
