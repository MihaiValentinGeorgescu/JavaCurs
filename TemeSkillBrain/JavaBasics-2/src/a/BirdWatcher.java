package a;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BirdWatcher {

    public static void main(String[] args) {
        int[] birdCounts = {1, 2, 3, 0, 5, 6, 7}; // Replace with your own data
        BirdWatcher birdWatcher = new BirdWatcher(birdCounts);

        // Test getLastWeek method
        int[] lastWeekCounts = birdWatcher.getLastWeek();
        System.out.println("Last week's counts: " + Arrays.toString(lastWeekCounts));

        // Test getToday method
        int todayCount = birdWatcher.getToday();
        System.out.println("Birds today: " + todayCount);

        // Test incrementTodaysCount method
        birdWatcher.incrementTodaysCount();
        todayCount = birdWatcher.getToday(); // Check if the count increased
        System.out.println("Birds today after increment: " + todayCount);

        // Test hasDayWithoutBirds method
        boolean hasDayWithoutBirds = birdWatcher.hasDayWithoutBirds();
        System.out.println("Has a day without birds: " + hasDayWithoutBirds);

        // Test getCountForFirstDays method
        int countForFirstDays = birdWatcher.getCountForFirstDays(4);
        System.out.println("Birds for the first 4 days: " + countForFirstDays);

        // Test getBusyDays method
        int busyDays = birdWatcher.getBusyDays();
        System.out.println("Busy days: " + busyDays);
    }

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        if( birdsPerDay.length > 0 ){
            return birdsPerDay[birdsPerDay.length -1];
        }else{
            return 0;
        }
    }

    public void incrementTodaysCount() {

        if(birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }

    }

    public boolean hasDayWithoutBirds() {
        for( int i = 0; i <= birdsPerDay.length-1; i++){
            if( birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumn = 0;
        for( int i = 0; i <= numberOfDays-1; i++){
            sumn = sumn + birdsPerDay[i];
        }

        return sumn;
    }

    public int getBusyDays() {

        int k = 0;

        for( int i = 0; i <= birdsPerDay.length-1; i++){
            if( birdsPerDay[i] >= 5) {
                k++;
            }
        }
        return k;
    }
}
