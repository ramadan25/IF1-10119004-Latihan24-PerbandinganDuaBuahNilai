/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 * Nama     : Muhamad Ramadan
 * Nim      : 10119004
 * Kelas    : IF1
 */

public class IF110119004Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1, nilai2, hasil;
        String pilihan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Perbandingan Nilai=====");
        do {
            System.out.print("Masukkan nilai Pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai Kedua : ");
            nilai2 = scanner.nextInt();
            if (nilai1 < nilai2){
                System.out.printf("Hasil : %1$d Lebih Kecil dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 > nilai2){
                System.out.printf("Hasil : %1$d Lebih Besar dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 == nilai2){
                System.out.printf("Hasil : %1$d Sama Dengan %2$d%n", nilai1, nilai2);
            }
            System.out.print("\nUlangi Aktifitas? Ya/Tidak : ");
            pilihan = scanner.next();
            System.out.println();
        } while (pilihan.equals("ya") || pilihan.equals("Ya"));
    }
    
}
