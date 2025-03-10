/**
 * File         : Arsersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Nama         : Gusti Ayu Genta Bhuana Paramitha
 * NIM          : 24060123130110
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling Lingkaran = "
            + kelilingLingkaran);
    }
}


// Pertanyaan
// 1. Secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
// Jelaskan pada lembar laporan praktikum!

// Jawaban
// 1. Pada program Asersi2.java, terdapat  kesalahan  konseptual  dalam  penggunaan  assert untuk  validasi nilai jariJari. Assertion di Java 
//    secara default tidak aktif dan  hanya akan  dieksekusi jika program  dijalankan dengan opsi -enableassertions atau -ea. Jika dijalankan
//    tanpa opsi tersebut, nilai jariJari = 0 tetap  diteruskan  ke  objek  Lingkaran, yang bertentangan  dengan tujuan program untuk menolak 
//    nilai nol.  Selain itu,  assertion  tidak  seharusnya  digunakan  untuk  validasi  input pengguna  karena  fungsinya  lebih cocok untuk 
//    mendeteksi bug pada  saat  pengembangan.  Sebagai alternatif yang lebih tepat, program sebaiknya menggunakan exception handling seperti 
//    IllegalArgumentException dalam konstruktor Lingkaran untuk memastikan nilai jariJari selalu valid, terlepas dari mode eksekusi program.