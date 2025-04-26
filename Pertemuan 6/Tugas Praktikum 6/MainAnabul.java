import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        ArrayList<Anabul> anabuls = new ArrayList<>();
        
        anabuls.add(new Kucing("Neko"));
        anabuls.add(new Anjing("Bruno"));
        anabuls.add(new Burung("Chiro"));

        for (Anabul a : anabuls) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}