import java.text.DecimalFormat;

class Dosen extends Karyawan {
    private static int jumlahDosen = 0;
    private Fakultas fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        jumlahDosen++;
    }

    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    public void tampilkanInfo() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("========== Info Dosen ==========");
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " Tahun");
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp " + df.format(hitungGaji()));
        System.out.println("Jumlah Dosen: " + jumlahDosen);
    }
}