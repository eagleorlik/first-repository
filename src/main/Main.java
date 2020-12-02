package main;

public class Main {
    public static void main(String[] args) {
        //int to jest liczba całkowita
        int price = 10;
        // int i long są najczęściej używanymi, byte i short zajmują mniej miejsca niż int i long
        byte price1 = 5;
        short price2 = 12;
        long price3 = 55;

        int cenaZaPlacki = price + price2;

        int weight = 102;
        double moon = 0.17;
        double weightOnMonn = weight * moon;
        {
            // int, byte, short, long, double, float, - typy proste
            int i = 10;
            i = i + 2;
            i += 2; //lepiej tak niż linijka wyżej
        }
        System.out.println(10 % 3);

        System.err.println("Moja waga na Księżycu " + weightOnMonn + " kg ");

        System.out.println("Lubie placki w cenie " + cenaZaPlacki + " zlotych ");

    }
}
