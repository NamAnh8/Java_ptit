/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.lang.*;
class number{
    long n;
    long d;
    static Scanner sc = new Scanner(System.in);
    void Input(){
        n = sc.nextLong();
        d = sc.nextLong();
    }
    void Output(){
        System.out.printf("%d/%d", n, d);
    }
    void simplify(){
        Long a = n;
        Long b = d;
        while(a != 0){
            Long x = a;
            a = b % a;
            b = x;
        }
        n /= b;
        d /= b;
    }
}
public class J04003_Phan_so {
    public static void main(String[] args){
       number a = new number();
       a.Input();
       a.simplify();
       a.Output();
    }
}
