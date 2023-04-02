/**
 * MLingkaran.java 02/04/2023
 * Penulis : Wahyu Arif Maulana - 24060120120018
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */
import java.util.Scanner;

class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Lingkaran l1 = new Lingkaran(10.2);
        Lingkaran l2 = new Lingkaran();
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        scan.close();
        System.out.println("Luas Lingkaran dengan jejari " + jejari +" satuan adalah " + l2.hitungLuas(jejari));
        // System.out.println("Luas Lingkaran dengan " + "jejari 10.2 satuan adalah " + l1.hitungLuas());
    }
}
