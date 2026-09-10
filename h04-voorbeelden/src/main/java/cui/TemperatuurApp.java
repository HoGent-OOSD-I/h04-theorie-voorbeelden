package cui;

import domein.TemperatuurStatistiek;

public class TemperatuurApp {

    // tag::main[]
    void main() {
        new TemperatuurApp().leesTemperaturenEnToonStatistieken();
    }

    private void leesTemperaturenEnToonStatistieken() {
        TemperatuurStatistiek ts = new TemperatuurStatistiek(); // <.>

        // Inlezen van temperaturen tot sentinel -100
        int dag = 1;
        double temperatuur = geefTemperatuur(dag++);
        while (temperatuur != -100) {
            ts.voegTemperatuurToe(temperatuur); // <.>
            temperatuur = geefTemperatuur(dag++);
        }

        // Bevragen van ts en alle resultaten tonen
        IO.println(ts.toString());
        IO.println(String.format("%nEr werden %svriestemperaturen opgemeten.", ts.bevatVriestemperaturen() ? "" : "geen "));
        IO.println(String.format("Dag %d was de warmste dag met %.1f graden.", ts.geefWarmsteDag(),
                ts.geefHoogsteTemperatuur()));
        double gezochteTemperatuur = 20;
        IO.println(String.format("Werd er een temperatuur van %.1f graden opgemeten? %s%n", gezochteTemperatuur,
                ts.isGemeten(gezochteTemperatuur) ? "ja" : "nee", gezochteTemperatuur));
    }

    private double geefTemperatuur(int dag) { // <.>
        return Double.parseDouble(IO.readln("Geef temperatuur in voor dag " + dag + " > "));
    }
    // end::main[]

}