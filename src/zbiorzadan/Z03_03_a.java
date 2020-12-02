package zbiorzadan;

public class Z03_03_a {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(Character.toUpperCase(array[i]));
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
