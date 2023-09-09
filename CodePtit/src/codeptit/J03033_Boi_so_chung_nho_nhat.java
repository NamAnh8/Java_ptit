/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.math.BigInteger;
public class J03033_Boi_so_chung_nho_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a, b;
            a = sc.nextLine();
            b = sc.nextLine();
            BigInteger x = new BigInteger(a, 10);
            BigInteger y = new BigInteger(b, 10);
            BigInteger GCD = x.gcd(y);
            x = x.multiply(y);
            BigInteger LCM = x.divide(GCD);
            System.out.println(LCM);
        }
    }
}
