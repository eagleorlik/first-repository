package zbiorzadan;

public class Z03_02_aa {
    public static void main(String[] args) {
        String[] goodMorning = {"Dzień dobry"};{
        System.out.println(goodMorning[0]);
        }

    char[] goodMorningSecondChoice = {'d', 'z', 'i', 'e', 'n', ' ', 'd', 'o', 'b', 'r', 'y'};
        for (int i = 0; i < goodMorningSecondChoice.length; i++ ) {
            System.out.println(goodMorningSecondChoice[i]);
        }

        System.out.println();

        for (char ch : goodMorningSecondChoice) {
            System.out.println(ch);
        }
    }

}



