package cui;

//tag::basisArrayList[]

import java.util.ArrayList;
import java.util.List;

public class BasisArrayList {
    void main() {
        List<String> benodigdheden = new ArrayList<>();

        // tag::AL_methods[]
        benodigdheden.add("hamer");
        benodigdheden.add("plank");
        benodigdheden.add("nagel");
        benodigdheden.add(1, "tang");
        IO.println("We hebben " + benodigdheden.size() + " zaken nodig...");

        if (benodigdheden.isEmpty())
            IO.println("We hebben niets nodig...");
        else
            IO.println("We hebben " + benodigdheden.size() + " zaken nodig...");
        String benodigdheid = benodigdheden.get(2);
        IO.println("We hebben een " + benodigdheid + " nodig.");
        benodigdheden.set(2, "balk");
        String oud = benodigdheden.set(2, "stok");
        IO.println("We hebben niet langer een " + oud + " nodig. We gaan een " + benodigdheden.get(2) + " gebruiken");
        new BasisArrayList().toonBenodigdheden(benodigdheden);
        String verwijderd = benodigdheden.remove(2);
        IO.println("De lijst van benodighdheden bevat niet langer " + verwijderd + "...");
        if (benodigdheden.remove("tank"))
            IO.println("We hebben een tank verwijderd");
        if (benodigdheden.remove("tang"))
            IO.println("We hebben een tang verwijderd");
    }

    private void toonBenodigdheden(List<String> benodigdheden) {
        for (String b : benodigdheden) {
            IO.println(b);
        }
    }
    // end::AL_methods[]
}
//end::basisArrayList[]
