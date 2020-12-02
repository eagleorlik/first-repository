package zbiorzadan;

public class Z03_02_b {
    public static void main(String[] args) {
        char[] oneWord = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a'};
        // wszystkie znaki poziomo, zamiast eneterów spacje
        for (int i = 0; i < oneWord.length; i++) {
            // System.out.print(oneWord[i] + " ");
            System.out.printf("%c ", oneWord[i]);
        }

        System.out.println();
        // pętla for-each
        for (char ch : oneWord) {
            System.out.print(ch + " ");
        }
    }
}
