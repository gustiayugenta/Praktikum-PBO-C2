import java.text.DecimalFormat;

class Tendik extends Karyawan {
    private static int jumlahTendik = 0;
    private static final double Gaji_Pokok = 3000000;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        jumlahTendik++;
    }

    public double hitungGaji() {
        return Gaji_Pokok + (masaKerja * 0.01 * Gaji_Pokok);
    }

    public void tampilkanInfo() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("========== Info Tendik ==========");
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " Tahun");
        System.out.println("Gaji: Rp " + df.format(hitungGaji()));
        System.out.println("Jumlah Tendik: " + jumlahTendik);
    }
}