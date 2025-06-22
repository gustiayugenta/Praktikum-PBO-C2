import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> dataMahasiswa = new HashMap<>();

        // Menambahkan data NIM dan Nama Mahasiswa
        dataMahasiswa.put("24060123130110", "Gusti Ayu Genta Bhuana Paramitha");

        // Menampilkan semua key dan value dengan ekspresi lambda
        dataMahasiswa.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}














