package a;

public class AnnalynsInfiltration {
    public static void main(String[] args) {

        boolean knightIsAwake = true;
        System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake));


        /*
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println(a.AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
         */

        /*
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        System.out.println(a.AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
         */

        /*
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(a.AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
         */
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}
