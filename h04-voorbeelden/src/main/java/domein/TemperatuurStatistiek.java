package domein;

import java.util.ArrayList;
import java.util.List;

public class TemperatuurStatistiek {

	private List<Double> temperaturen = new ArrayList<>(); // <.>

	public void voegTemperatuurToe(double temperatuur) {
		temperaturen.add(temperatuur); // <.>
	}

	public boolean bevatVriestemperaturen() { // <.>
		for (double t : temperaturen) { // <.>
			if (t <= 0)
				return true;
		}
		return false;
	}

	public double geefHoogsteTemperatuur() { // <.>
		double warmsteTemperatuur = temperaturen.getFirst(); // <.>
		for (double t : temperaturen) {
			if (t > warmsteTemperatuur)
				warmsteTemperatuur = t;
		}
		return warmsteTemperatuur;
	}

	public int geefWarmsteDag() {
		return temperaturen.indexOf(geefHoogsteTemperatuur()) + 1; // <.>
	}

	@Override
	public String toString() {
		int aantalDagen = temperaturen.size(); // <.>
		String resultaat = String.format("Overzicht temperaturen per dag voor %d dag%s%n", aantalDagen,
				aantalDagen > 1 ? "en" : "");
		for (int i = 0; i < aantalDagen; i++) { // <.>
			resultaat += String.format("Dag %d: %.1f graden%n", i + 1, temperaturen.get(i));
		}
		return resultaat;
	}

	public boolean isGemeten(double i) {
		return temperaturen.contains(i);
	}

}
