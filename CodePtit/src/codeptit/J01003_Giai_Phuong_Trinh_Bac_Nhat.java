/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01003_Giai_Phuong_Trinh_Bac_Nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else{
            System.out.printf("%.2f", -b/a);
        }
    }
}
