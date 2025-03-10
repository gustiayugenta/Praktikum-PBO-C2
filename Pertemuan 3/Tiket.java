public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        int tiketTersedia = 100;

        // Jika jumlah tiket tidak valid, lempar exception agar program berhenti
        if (jumlahTiket <= 0) {
            throw new IllegalArgumentException("Jumlah tiket harus lebih dari 0!");
        }
        if (jumlahTiket > tiketTersedia) {
            throw new IllegalArgumentException("Jumlah tiket yang dipesan melebihi tiket yang tersedia!");
        }

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int EWallet) {
        // Validasi agar input e-wallet harus di antara 1-4
        if (EWallet < 1 || EWallet > 4) {
            throw new IllegalArgumentException("Pilihan e-wallet tidak valid! Silakan pilih angka 1-4.");
        }

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1: return "OVO";
            case 2: return "GoPay";
            case 3: return "DANA";
            case 4: return "LinkAja";
            default: return "";
        }
    }
}
