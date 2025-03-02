/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : Minggu, 2 Maret 2025
 */

public class Mahasiswa {

    /**************** ATRIBUT *****************/
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul; // Array statik berukuran 50
    private int jumlahMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**************** METHOD *****************/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method untuk menambahkan mata kuliah
    public void addMatKul(MataKuliah matKul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = matKul;
            jumlahMatKul++;
        } else {
            System.out.println("Mata kuliah penuh!");
        }
    }

    // Method untuk menghitung total SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }

    // Method untuk mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    // Method untuk menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk menampilkan detail mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum ditentukan"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getJenis() + " - " + kendaraan.getNoPlat() : "Tidak ada"));
        System.out.println("Mata Kuliah yang diambil:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
        }
        System.out.println("Total SKS: " + getJumlahSKS());
    }
} //end class Mahasiswa