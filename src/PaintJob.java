public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int remainingBuckets;
        if(width <= 0|| height <=0 || areaPerBucket <=0 || extraBuckets < 0 ){
            return -1;
        }else{
            double wallArea = width * height;
            remainingBuckets = (int) Math.ceil(((wallArea / areaPerBucket) -  extraBuckets));
            System.out.println(remainingBuckets);
        }
        return remainingBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int remainingBuckets;
        if(width <= 0|| height <= 0|| areaPerBucket <= 0){

            return -1;
        }else{

            double wallArea = width * height;
            remainingBuckets = (int)Math.ceil(wallArea / areaPerBucket);
            System.out.println(remainingBuckets);

        }

        return remainingBuckets;
    }

    public static  int getBucketCount(double area, double areaPerBucket){
        int numberOfBuckets;
        if(area <= 0|| areaPerBucket <=0){
            return -1;
        }else{

            numberOfBuckets= (int)Math.ceil(area/areaPerBucket);
            System.out.println(numberOfBuckets);
        }
        return numberOfBuckets;
    }

}
