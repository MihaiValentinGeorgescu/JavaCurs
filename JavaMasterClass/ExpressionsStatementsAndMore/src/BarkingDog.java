import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BarkingDog {
    public static void main(String[] args){
        Random random = new Random();
        int zileMaxPanaLaConcediere = 5;
        int ziInitiala = 1;

        do {
            boolean latraCanele = random.nextBoolean();
            int oraZi = random.nextInt(24);
            if (shouldWakeUp(latraCanele, oraZi)) {
                System.out.println("canele latra si e bine");
                break;
            } else {
                System.out.println("canele nu latra si nu e bine mai inceracam intr-alta zi");
                try {
                    Thread.sleep(3000); // Sleep for 3 seconds (3000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            ++ ziInitiala;
        }while(ziInitiala < zileMaxPanaLaConcediere);

        if ( ziInitiala == zileMaxPanaLaConcediere ){
            System.out.println("am imbulinat-o grav");
        }
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){

        if ( hourOfDay < 0 && hourOfDay > 23){
            return false;
        }

        if ( isBarking == true && hourOfDay < 8 || hourOfDay > 22){
            return true;
        }else{
            return false;
        }
    }
}
