/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan34.objectoriented.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author asus
 
 * NAMA     : Moch  Yudha Rusdian
 * KELAS    : IF-1
 * NIM      : 10118040
 * Deskripsi Program : Program ini untuk menampilkan tampilan kalkulator.
 */
public class IF110118040Latihan34ObjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scn = new Scanner(System.in);
        kalkulator kal = new kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kal.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kal.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kal.sisaBilangan());

    
    }
    
}
