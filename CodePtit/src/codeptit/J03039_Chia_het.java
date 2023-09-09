/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.math.BigInteger;
import java.util.*;
public class J03039_Chia_het {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.mod(b).intValue() == 0 || b.mod(a).intValue() == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
