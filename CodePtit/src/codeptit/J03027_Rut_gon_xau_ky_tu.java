/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J03027_Rut_gon_xau_ky_tu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        String s = sc.nextLine();
        for(int i = s.length() - 1; i >= 0; i--){
            if(!st.isEmpty() && s.charAt(i) == (char) st.peek())
                st.pop();
            else st.push(s.charAt(i));
        }
        if(st.isEmpty()) System.out.println("Empty String");
        else{
            while(!st.isEmpty()) System.out.print(st.pop());
        }
    }
}
