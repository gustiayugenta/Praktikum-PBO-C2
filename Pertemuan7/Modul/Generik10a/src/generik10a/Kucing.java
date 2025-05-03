package generik10a;

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " merayap.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong!");
    }
}
