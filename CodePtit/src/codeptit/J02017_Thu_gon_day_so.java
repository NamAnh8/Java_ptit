/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J02017_Thu_gon_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while(n-- > 0){
            int x = sc.nextInt();
            if(!st.isEmpty() && (x + st.peek()) % 2 == 0) st.pop();
            else st.push(x);
        }
        System.out.println(st.size());
    }
}
