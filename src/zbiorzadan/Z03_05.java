package zbiorzadan;

public class Z03_05 {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};

        // int x,y,z; - można deklarować w jednej linijce
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        System.out.println(array);
    }

}
