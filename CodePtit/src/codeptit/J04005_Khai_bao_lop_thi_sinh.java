/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.lang.*;

class Student{
    String name;
    String date;
    float sub1, sub2, sub3, sum_sub;
    
    void Input(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        date = sc.next();
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sum_sub = sub1 + sub2 + sub3;
    }
    void Output(){
        System.out.printf("%s %s %.1f", name, date, sum_sub);
    }
}
public class J04005_Khai_bao_lop_thi_sinh {
    public static void main(String[] args){
        Student student = new Student();
        student.Input();
        student.Output();
    }
}
