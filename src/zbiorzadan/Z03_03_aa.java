package zbiorzadan;

public class Z03_03_aa {
    public static void main(String[] args) {
        char[] joke = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e', ' ', 'd', 'z', 'b', 'a', 'n', 'i', 'e'};
        for (int i = 0; i < joke.length; i++) {
            if (i == 0) {
                System.out.print(Character.toUpperCase(joke[i]));
            } else {
                System.out.print(joke[i]);
            }
        }
    }
}
