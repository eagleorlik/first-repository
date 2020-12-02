package cwiczenia;

public class C002_ZlotowkiNaFranki {
    public static void main(String[] args) {
        final double exchangeRate = 4.14;
        int pln = 1;
        // wyświetl od jednego do stu, z enterem co 10 wiersz
        int counter = 0;
//        for (int i = 0; i < 100; i++) {
//            System.out.printf("%d zlotych to %f frankow\n", pln, pln / exchangeRate);
//            if (counter == 10) {
//                counter = 0;
//                System.out.println();
//            }
//            pln++;
//            counter++;
//        }
        // ma się wyświetlać co 5zł
        //%d - liczba całkowita
        //%f - zmienna przecinkowa
        for (pln = 5; pln <= 300; pln+=5) {
            System.out.printf("%d zlotych to %f frankow\n", pln, pln / exchangeRate);
            if (counter == 10) {
                counter = 0;
                System.out.println();
            }
            counter++;

        }


    }
}
