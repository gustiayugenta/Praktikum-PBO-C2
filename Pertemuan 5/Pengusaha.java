/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pengusaha extends Manusia {
    private static int counterPengusaha = 0;
    private String NPWP;
    private static final int B = 1;
    
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String NPWP) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + B;
    }
}