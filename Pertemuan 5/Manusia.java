/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam class Manusia
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.text.DecimalFormat;

abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;
    
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public abstract double hitungPajak();

    public abstract long hitungMasaKerja();

    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("\nNama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + df.format(pendapatan));
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " hari");
    }
}
