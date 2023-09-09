/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
class Time{
    int h;
    int m;
    int s;
    
    void Input(Scanner sc){
        this.h = sc.nextInt();
        this.m = sc.nextInt();
        this.s = sc.nextInt();
    }
    void output(){
        System.out.printf("%d %d %d\n", h, m, s);
    }
}
public class J05033_Sap_xep_thoi_gian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Time> v = new Vector<Time>();
        for(int i = 0; i < n; i++){
            Time x = new Time();
            x.Input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<Time>() {
            @Override
            public int compare(Time a, Time b) {
                if (a.h == b.h) {
                    if (a.m == b.m) {
                        if (a.s > b.s)
                            return 1;
                        else
                            return -1;
                    } else if (a.m > b.m)
                        return 1;
                    else
                        return -1;
                } else if (a.h > b.h)
                    return 1;
                else
                    return -1;
            }
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
        
    }
}
