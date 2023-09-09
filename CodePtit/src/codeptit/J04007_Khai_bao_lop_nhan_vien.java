/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.lang.*;
class Employee{
    String id;
    String name;
    String gender;
    String birth;
    String address;
    String tax_num;
    String Start_date;
    
    void Input(){
        Scanner sc = new Scanner(System.in);
        id = "00001";
        name = sc.nextLine();
        gender = sc.next();
        birth = sc.next();
        sc.nextLine();
        address = sc.nextLine();
        tax_num = sc.next();
        Start_date = sc.next();
    }
    void Output(){
        System.out.printf("%s %s %s %s %s %s %s", id, name, gender, birth,address, tax_num, Start_date);
    }
}
public class J04007_Khai_bao_lop_nhan_vien {
    public static void main(String[] args){
        Employee a = new Employee();
        a.Input();
        a.Output();
    }
}
