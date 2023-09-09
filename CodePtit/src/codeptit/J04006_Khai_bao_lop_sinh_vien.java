/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.lang.*;
class SV {
    String ten;
    String ns;
    String lop;
    String maSV;
    float GPA;

    SV() {
        maSV = "B20DCCN001";
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        lop = sc.next();
        ns = sc.next();
        GPA = sc.nextFloat();
        if (ns.charAt(1) == '/')
            ns = '0' + ns;
        if (ns.charAt(4) == '/')
            ns = ns.substring(0, 3) + '0' + ns.substring(3);
    }

    void Output() {
        System.out.printf("%s %s %s %s %.2f", maSV, ten, lop, ns, GPA);
    }
}
public class J04006_Khai_bao_lop_sinh_vien {
    public static void main(String[] args){
        SV sv = new SV();
        sv.Input();
        sv.Output();
    }
}
