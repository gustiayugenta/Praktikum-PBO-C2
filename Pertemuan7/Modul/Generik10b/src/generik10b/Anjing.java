package generik10b;

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " merayap.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Guk-guk!");
    }
}
