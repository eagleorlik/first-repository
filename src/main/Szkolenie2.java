package main;

public class Szkolenie2 {
    public static void main(String[] args) {
        int i = 10;
        // if (warunek) instrukcja;
        if (i % 3 == 0) System.out.println("Liczba jest podzielna przez 3");
        if (i % 3 != 0) System.out.println("Liczba nie jest podzielna przez 3");

        i += 5;
        if (i % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 5");
        } else {
            System.out.println("Liczba nie jest podzielna przez 5");
        }

        i *= 3;
        if (i > 50) {
            System.out.println("Liczba jest większa od 50");
        } else if (i == 45) {
            System.out.println("Jest równe 45");
        } else {
            System.out.println("Liczba nie jest większa od 50 ani równa 45");
        }

        i *= 2;
        if (i >= 90) {
            System.out.println("Jest większe lub równe 90");
        }

        if (i % 5 == 0 && i % 10 == 0) {
            System.out.println("Liczba jest podzielna przez 5 ORAZ jest podzielna przez 10");
        }

        if (i % 17 == 0 && i % 10 == 0) {
            System.out.println("To się nie wyświetli ponieważ liczba jest podzielna przez 10 ale nie jest podzielna przez 17");
        }

        if (i - 2 == 14 || i % 10 == 0) {
            System.out.println("Liczba -2 jest równa 14 ALBO jest podzielna przez 10");
        }



    }
}
