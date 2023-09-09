/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J03032_Dao_tu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            String[] a = s.split(" ");
            for(String i : a){
                StringBuilder tmp = new StringBuilder(i);
                System.out.print(tmp.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
