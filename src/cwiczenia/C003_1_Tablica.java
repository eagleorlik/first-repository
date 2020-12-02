package cwiczenia;

public class C003_1_Tablica {
    // Sumuj wartości integerów w tablicy
    public static void main(String[] args) {
        int[] integers = {5, 11, 17, 22, 28, 36, 58};
        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        System.out.println(sum);

    }
}
