package cwiczenia;

public class C003_2_Tablica {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4};
        // pomnożyć tylko co trzeci element i tylko jeżeli jest parzysty
        int product = 1;
        for (int i = 0; i < integers.length; i += 3) {
            final int currentElement = integers[i];
            //sprawdzanie czy liczba jest parzysta
            if (currentElement % 2 == 0) {
                product *= currentElement;
            }

        }
        System.out.println(product);

    }
}
// to co miedzy braketami jest blokiem kodu. Jeżeli brakety dotyczą metody, if, for itp stają się jego ciałem
// metoda -
// refaktoryzacja - poprawianie jakości kodu.
// konkatenacja, inicjalizacja, iteracja, indeks, deklaracja, kompilacja, zmienna, stała, ciało metody,
// indeks 0- numer porzadkowy, int, nie ma żadnej wartości
// indeks elementu 
// element


