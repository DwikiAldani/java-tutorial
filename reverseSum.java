/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
public class reverseSum {
    public static void main(String[] args) {
        int x, z, a, b, m = 0, n = 0, all;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Bilangan Pertama : ");
        x = s.nextInt();
        System.out.print("Masukang Bilangan Kedua : ");
        z = s.nextInt();
        
        do{
            a = x % 10;
            m = m * 10 + a;
            x = x / 10;
        }
        while(x>0);
        do{
            b = z % 10;
            n = n * 10 + b;
            z = z / 10;
        }
        while(z>0);
        
        System.out.println("Hasil reverse bilangan pertama : "+m);
        System.out.println("Hasil reverse bilangan kedua : "+n);
        
        System.out.println("Penjumlahan Kedua Bilangan Reverse");
        all = m + n;
        System.out.println(all);
    }
    
}
