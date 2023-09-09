/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
class Teacher{
    String id;
    String name;
    int salary_level;
    int salary_basic;
    int allowance;
    int income;
    
    void Input(Scanner sc){
        id = sc.nextLine();
        name = sc.nextLine();
        salary_basic = sc.nextInt();
        if(id.substring(0, 2).compareTo("HT") == 0)
            allowance = 2000000;
        else if(id.substring(0,2).compareTo("HP") == 0)
            allowance = 900000;
        else
            allowance = 500000;
        salary_level = (id.charAt(2) - '0') * 10 + id.charAt(3) - '0';
        income = salary_level * salary_basic + allowance;
    }
    void output(){
        System.out.printf("%s %s %d %d %d", id, name, salary_level, allowance, income);
    }
}
public class J04015_Thu_nhap_giao_vien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Teacher a = new Teacher();
        a.Input(sc);
        a.output();
    }
}
