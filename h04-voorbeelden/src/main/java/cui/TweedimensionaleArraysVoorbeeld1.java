package cui;

public class TweedimensionaleArraysVoorbeeld1 {
    void main() {
        new TweedimensionaleArraysVoorbeeld1().maakEnToonEenTweedimensionaleArray();
    }

    private void maakEnToonEenTweedimensionaleArray() {

        int[][] jagged2 = {{11, 22, 33}, {-2, -5}, {4, 4, 4, 4}};

        IO.println("De waarden in de array rij per rij:\n");
        String uitvoer = "";
        for (int[] rij : jagged2) { // <.>
            for (int element : rij) // <.>
                uitvoer += String.format("%8d", element);
            uitvoer += "\n";
        }
        IO.print(uitvoer);
    }
}
