/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.lang.*;
class Retangle{
    double w;
    double h;
    String c;
    
    void input(Scanner sc){
        this.w = sc.nextDouble();
        this.h = sc.nextDouble();
        String s = sc.next();
        this.c = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    boolean check(){
        int w_check = (int) this.w;
        int h_check = (int) this.h;
        if(w_check != w || h_check != h || w <= 0 || h <= 0) return false;
        return true;
    }
    double S(){
        return w * h;
    }
    double C(){
        return (w + h) * 2;
    }    
}
public class J04002_Khai_bao_lop_hcn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangle rec = new Retangle();
        rec.input(sc);
        if(rec.check()) System.out.printf("%d %d %s", (int) rec.C(), (int) rec.S(), rec.c);
        else System.out.print("INVALID");
    }
}
