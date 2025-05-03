package generik10b;

public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T anabul = data.getIsi();
        anabul.gerak();
        anabul.bersuara();
    }
}
