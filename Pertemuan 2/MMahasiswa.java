/* Nama File    : MMahasiswa.java
 * Deskripsi    : Main class Mahasiswa
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : Minggu, 2 Maret 2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Mahasiswa tanpa parameter  
        System.out.println("\n===== Mahasiswa 1 =====");
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.setNim("150");
        mhs1.setNama("Budi Santoso");
        mhs1.setProdi("Sistem Informasi");

        // Membuat mata kuliah tanpa menggunakan parameter
        MataKuliah MK1 = new MataKuliah();
        MK1.setNama("Basis Data");
        MK1.setSks(4);
        mhs1.addMatKul(MK1);  
        
        MataKuliah MK2 = new MataKuliah();
        MK2.setNama("Pemrograman Web");
        MK2.setSks(3);
        mhs1.addMatKul(MK2);  

        // Objek dosenWali tanpa menggunakan parameter 
        Dosen DW1 = new Dosen();
        DW1.setNama("Dr. Suryanto");
        mhs1.setDosenWali(DW1);

        // Objek kendaraan tanpa parameter
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJenis("Motor");
        mhs1.setKendaraan(kendaraan);
        
        // Menampilkan detail mahasiswa 
        mhs1.printDetailMhs();

        // Menampilkan jumlah sks yang diambil 
        System.out.println("Jumlah SKS: " + mhs1.getJumlahSKS());

        // Menampilkan jumlah matkul yang diambil 
        System.out.println("Jumlah Matkul: " + mhs1.getJumlahMatKul());

        System.out.println("\n===== Mahasiswa 2 =====");
        // Mahasiswa dengan parameter
        Mahasiswa mhs2 = new Mahasiswa("201", "Citra Lestari", "Teknik Mesin");
        Dosen DW2 = new Dosen("334455", "Prof. Hendra", "Teknik Mesin");
        mhs2.setDosenWali(DW2);

        // Menambahkan mata kuliah dengan parameter
        MataKuliah MK3 = new MataKuliah("TMK101", "Termodinamika", 4);
        MataKuliah MK4 = new MataKuliah("MKN102", "Mekanika", 3);
        mhs2.addMatKul(MK3);
        mhs2.addMatKul(MK4);

        // Menampilkan detail mahasiswa 2
        mhs2.printDetailMhs();

        // Menampilkan jumlah sks dan jumlah matkul yang diambil 
        System.out.println("Jumlah SKS yang diambil: " + mhs2.getJumlahSKS());
        System.out.println("Jumlah Matkul yang diambil: " + mhs2.getJumlahMatKul());
    }
}