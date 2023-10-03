public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // Should print 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Should print 3
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // Should print 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // Should print 10
        System.out.println(getBucketCount(3.4, 1.5)); // Should print 3
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int numberOfBuckets = 0;

        if((width <=0)||(height <=0)||(areaPerBucket <=0)||(extraBuckets <0)){
            return -1;
        }

        int avg= getBucketCount(height,width,areaPerBucket);
        avg = avg - extraBuckets;
        return avg;

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if((width <=0)||(height <=0)||(areaPerBucket <=0)){
            return -1;
        }

        double area = width * height;

        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <=0 || areaPerBucket <=0){
            return -1;
        }
        return (int)Math.ceil(area/areaPerBucket);
    }
}
