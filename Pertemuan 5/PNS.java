/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PNS extends Manusia {
    private static int counterPNS = 0;
    private String NIP;
    private static final int A = 0;
    
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String NIP) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + A;
    }
}