/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
public class J01025_Hinh_vuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        int x4 = sc.nextInt(), y4 = sc.nextInt();
        int maxX12 = Math.max(x1, x2);
        int maxX34 = Math.max(x3, x4);
        int maxX = Math.max(maxX12, maxX34);
        int minX12 = Math.min(x1, x2);
        int minX34 = Math.min(x3, x4);
        int minX = Math.min(minX12, minX34);
        int maxY12 = Math.max(y1, y2);
        int maxY34 = Math.max(y3, y4);
        int maxY = Math.max(maxY12, maxY34);
        int minY12 = Math.min(y1, y2);
        int minY34 = Math.min(y3, y4);
        int minY = Math.min(minY12, minY34);
        int k = Math.max(maxX - minX,maxY - minY);
        System.out.println(k * k);
    }
}
