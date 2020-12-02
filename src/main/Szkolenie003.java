package main;

public class Szkolenie003 {
    public static void main(String[] args) {
        int counter = 20;
        // for (inicjalizacja; warunek; iteracja) instrukcja;
        for (int i = 0; counter < 30; ) {
            counter += 1;
            System.out.println("Wartość liczby jest równa " + counter);
            // konkatenacja - łączenie stringów

        }

        for (int i = 0; i < 10; i++) {
            counter += 2;
            System.err.println("Wartość liczby jest równa " + counter);
            // inkrementacja - zwiększenie o 1
            // dekrementacja - zmniejszenie o 1
        }
    }
}
