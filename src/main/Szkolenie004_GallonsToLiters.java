package main;

public class Szkolenie004_GallonsToLiters {
    // Wyświetl listę zamiany galonów na litry od 1l do 100l
    // 1 galon = 3.7854l
    // co 10 litów wyświetl pusty wiersz
    public static void main(String[] args) {
        double literMultiplier = 3.7854;
        // 1. X Litrów = Y Galonów
        // np 1l = 0,26G
        // wyświetlić w pętli 100razy
        // co 10 wyświetleń wyświetlić pusty wiersz

        int liters = 1;
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            double gallons = liters / literMultiplier;
            System.out.println(liters + " litrów to " + gallons + " galonów");
            liters++;
//            if (counter%10 == 0) {
//                System.out.println();
//            }

            if (counter == 10) {
                counter = 0;
                System.out.println();
            }

            counter++;
        }
    }
}
