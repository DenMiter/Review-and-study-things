package Exercism.NFS;

public class Main {

    public static void main(String[] args) {

        RaceTrack raceTrack = new RaceTrack(200);

        NeedForSpeed car1 = new NeedForSpeed(10, 7);
        NeedForSpeed car2 = NeedForSpeed.nitro();

        raceTrack.canFinishRace(car1);
        System.out.println();
        raceTrack.canFinishRace(car2);
    }

}
