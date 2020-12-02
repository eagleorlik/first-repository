package zbiorzadan;

public class Z03_02_dd {
    public static void main(String[] args) {
        char[] twoWord = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a', ' ', 'l', 'a', 'i', 'k', 'a'};
        for (int i = 0; i < twoWord.length; i++) {
            System.out.print(Character.toLowerCase(twoWord[i]));
        }
        System.out.println();
        for (char ch : twoWord) {
            System.out.print(Character.toLowerCase(ch));
        }

    }
}
