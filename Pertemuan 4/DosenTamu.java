/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 17 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate tanggalAkhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public long hitungSisaKontrak() {
        return ChronoUnit.MONTHS.between(LocalDate.now(), tanggalAkhirKontrak);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK   : " + NIDK);
        System.out.println("Nama   : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(formatter));
        System.out.println("TMT   : " + TMT.format(formatter));
        System.out.println("Jabatan  : Dosen Tamu");
        System.out.println("Fakultas  : " + fakultas);
        System.out.println("Sisa Kontrak  : " + hitungSisaKontrak() + " bulan");
        System.out.println("Gaji Pokok  : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan  : 2.5% x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}