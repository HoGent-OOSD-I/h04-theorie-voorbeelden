package cui;

//tag::Enquete[]
public class Enquete {
    void main() {
        new Enquete().verwerkEnquete();
    }

    private void verwerkEnquete() {
        int[] scores = {5, 2, 5, 4, 3, 5, 2, 1, 5, 5, 1, 4, 3, 3, 4, 5, 5, 4, 2};
        int[] resultaten = new int[5]; // <.>

        for (int score : scores) { // <.>
            resultaten[score - 1]++;
        }

        IO.println(String.format("%8s%8s", "Score", "Aantal"));
        for (int resultaat = 0; resultaat < resultaten.length; resultaat++) {
            IO.println(String.format("%8d%8d", resultaat + 1, resultaten[resultaat])); // <.>
        }

        IO.println("Totaal aantal antwoorden: " + scores.length); // <.>
    }

}
//end::Enquete[]

// Antwoord    Aantal
//		  1         2
//		  2         3
//	      3         3
//		  4         4
//		  5         7
