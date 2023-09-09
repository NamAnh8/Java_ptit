/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

class Pair{
        public int t;
        public int d;
        
        void input(Scanner sc){
            t = sc.nextInt();
            d = sc.nextInt();
        }
    }
public class J02009_Xep_hang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Vector<Pair> v = new Vector<>();
        for(int i = 0; i < t; i++){
            Pair x = new Pair();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, Comparator.comparing(pair -> pair.t));
        int sum = 0;
        for(int i = 0; i < t; i++){
            if(sum < v.get(i).t) sum = v.get(i).t;
            sum += v.get(i).d;
        }
        System.out.println(sum);
    }
}
