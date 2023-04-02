/**
 * Lingkaran.java 02/04/2023
 * Penulis : Wahyu Arif Maulana - 24060120120018
 * Deskripsi : kelas implementasi IArea berupa cara menghitung
 *             luas lingkaran
 */
import static java.lang.Math.PI;

class Lingkaran implements IArea{
    // private double jejari;

    public Lingkaran(){};

    // public Lingkaran(double r){
    //     jejari = r;
    // }

    public double hitungLuas(double jejari){
        return PI*jejari*jejari;
    }
}


