package a;

public class Lasagna {

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Cate minute tre sa stea lasagnaua in cuptor:");
        System.out.println(lasagna.expectedMinutesInOven());

        System.out.println("cate minute mai are lasaganaua de stat in cuptor:");
        System.out.println(lasagna.remainingMinutesInOven(30));

        System.out.println("cate minute ar trebui sa stea lasagnaua in cuptor cu layerele alea:");
        System.out.println(lasagna.preparationTimeInMinutes(2));

        System.out.println("cate minute in total tre sa stea lasagnaua mea:");
        System.out.println(lasagna.totalTimeInMinutes(20, 3));

    }
    public static int expectedMinutesInOven(){
        return 40;
    }


    public static int remainingMinutesInOven(int minuteInCuptor) {
        int expecMinutesInOven = expectedMinutesInOven();
        int remMinutesInOven = expecMinutesInOven - minuteInCuptor;

        return remMinutesInOven;
    }



    public static int preparationTimeInMinutes(int layers){
        int timpCoacere = layers * 2;
        return timpCoacere;
    }



    public static int totalTimeInMinutes(int minute, int layers){
        int prepTime = preparationTimeInMinutes(layers);
        int totalCookeTime = prepTime + minute;

        return totalCookeTime;
    }
}
