/* Nama File    : Main.java
 * Deskripsi    : berisi atribut dan method dalam class Main
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 17 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n==== Detail Pegawai 1 ====\n");
        DosenTetap dt = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        dt.printInfo();
        
        System.out.println("\n==== Detail Pegawai 2 ====\n");
        
        DosenTamu dtm = new DosenTamu("9545647550", "Budi", LocalDate.of(1985, 8, 15), LocalDate.of(2020, 2, 1), 4000000, "Fakultas Teknik", "12345678", LocalDate.of(2026, 5, 1));
        dtm.printInfo();
        
        System.out.println("\n==== Detail Pegawai 3 ====\n");
        
        Tendik td = new Tendik("1234567890", "Citra", LocalDate.of(1980, 3, 10), LocalDate.of(2005, 7, 1), 3500000, "Kemahasiswaan");
        td.printInfo();
    }
}

