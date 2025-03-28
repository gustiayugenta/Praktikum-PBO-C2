public class Main {
    public static void main(String[] args) {
        Fakultas fsm = new Fakultas("FSM", 5000000, 7000000);
        Fakultas feb = new Fakultas("FEB", 6000000, 6000000);


        Mahasiswa mhs1 = new Mahasiswa("Genta", "genta123@gmail.com", "24060123130110", 4, fsm);
        Dosen dosen1 = new Dosen("Khadijah, S.Kom., M.Cs", "khadijah@gmail.com", "198903032015042002", 9, fsm);
        Tendik tendik1 = new Tendik("Adit", "adit@gmail.com", "199505062100348221", 2);

        mhs1.tampilkanInfo();
        System.out.println();
        dosen1.tampilkanInfo();
        System.out.println();
        tendik1.tampilkanInfo();
    }
}