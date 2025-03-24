/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Petani extends Manusia {
    private static int counterPetani = 0;
    private String daerah;
    private static final int C = 1;
    
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String daerah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerah = daerah;
        counterPetani++;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    public double hitungPajak() {
        return 0.0;
    }
    
    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + C;
    }
}
