/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

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
    number plus(number y){
        number x = new number();
        x.d = d * y.d;
        x.n = n * y.d + d * y.n;
        x.simplify();
        return x;
    }
}
public class J04004_Tong_phan_so {
    public static void main(String[] args){
       number a = new number();
       number b = new number();
       a.Input();
       b.Input();
       number c = a.plus(b);
       c.Output();
    }
}
