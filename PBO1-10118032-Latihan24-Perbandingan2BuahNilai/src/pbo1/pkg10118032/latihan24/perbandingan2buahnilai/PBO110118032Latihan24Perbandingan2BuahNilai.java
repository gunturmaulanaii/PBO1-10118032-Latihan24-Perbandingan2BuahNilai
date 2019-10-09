/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan24.perbandingan2buahnilai;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Membandingkan 2 Buah Nilai
 */
public class PBO110118032Latihan24Perbandingan2BuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**********Program Perbandingan Nilai**********");
	Scanner sc = new Scanner(System.in);
	String Status = "Ya";	
	while (Status.equals("Ya")){
		System.out.print("Masukkan Nilai Pertama : ");
		int[] nilai = new int[2];
		nilai[0] = sc.nextInt();
		System.out.print("Masukkan Nilai Kedua : ");
		nilai[1] = sc.nextInt();
		System.out.println("Hasil : " + nilai[0] + ((nilai[0] < nilai[1]) ? " Lebih Kecil " : ((nilai[0] == nilai[1]) ? " Sama Dengan " : " Lebih Besar ")) + nilai[1] );
		System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
		Status = sc.next();
	}
    }
    
}
