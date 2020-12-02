package cwiczenia;

public class C001_Piorun {
    public static void main(String[] args){
        // jak daleko uderzył piorun, prędkość dźwięku wynosi 330m/s.Piorun uderzył 5,5s.
        int soundSpeed = 330;
        double time = 5.5;
        System.out.println("Piorun uderzył w odległosci " + soundSpeed * time +"m");

        // ("Lubie placki o cenie %f zlotych", 23);
        System.out.printf("Piorun uderzył w odległosci %f m.",(soundSpeed * time));
    }
}
