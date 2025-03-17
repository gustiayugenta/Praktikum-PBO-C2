/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 17 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

class DosenTetap extends Dosen {
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        return 0.02 * (ChronoUnit.YEARS.between(TMT, LocalDate.now())) * gajiPokok;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).withMonth(6);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN   : " + NIDN);
        System.out.println("Nama   : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(formatter));
        System.out.println("TMT   : " + TMT.format(formatter));
        System.out.println("Jabatan  : Dosen Tetap");
        System.out.println("Fakultas  : " + fakultas);
        System.out.println("Masa Kerja  : " + hitungMasaKerja());
        System.out.println("BUP   : " + hitungBUP().format(formatter));
        System.out.println("Gaji Pokok  : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan  : 2% x " + hitungMasaKerjaDalamTahun() + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}