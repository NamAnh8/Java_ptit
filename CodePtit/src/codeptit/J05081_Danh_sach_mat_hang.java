/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

class Item{
    static int id = 1;
    String Item_id;
    String Item_name;
    String measurement;
    int buy;
    int sell;
    int interest;
    
    void Input(Scanner sc){
        if(id < 10) Item_id = "MH00";
        else if (id < 100) Item_id = "MH0";
        else Item_id = "MH";
        Item_id += Integer.toString(id++);
        sc.nextLine();
        Item_name = sc.nextLine();
        measurement = sc.nextLine();
        buy = sc.nextInt();
        sell = sc.nextInt();
        interest = sell -buy;
    }
    
    void output(){
        System.out.printf("%s %s %s %d %d %d\n", Item_id, Item_name, measurement, buy, sell, interest);
    }
}
public class J05081_Danh_sach_mat_hang {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Item> v = new Vector<>();
        for(int i = 0; i < n; i++){
            Item a = new Item();
            a.Input(sc);
            v.add(a);
        }
       Collections.sort(v, new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                if (a.interest == b.interest) {
                    if (a.Item_id.compareTo(b.Item_id) > 0)
                        return 1;
                    else
                        return -1;
                } else if (a.interest < b.interest)
                    return 1;
                else
                    return -1;
            }
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
    }
}
