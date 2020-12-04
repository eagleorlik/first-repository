package zbiorzadan;

public class Z03_03_bb {
    public static void main(String[] args) {
        char[] joke = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e', ' ', 'd', 'z', 'b', 'a', 'n', 'i', 'e'};
        for (int i = 0; i < joke.length; i++) {
            System.out.print(Character.toUpperCase(joke[i]));
        }

        char[] jokeUpperCase = new char[joke.length];
        for (int i = 0; i < joke.length; i++) {
            jokeUpperCase[i] = Character.toUpperCase(joke[i]);
        }

        System.out.println();
        System.out.println(joke);
        System.out.println(jokeUpperCase);

    }
}
