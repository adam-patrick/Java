public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        } else {
            double area = width * height;
            int buckets = getBucketCount(area, areaPerBucket);
            int bucketsLeft = buckets - extraBuckets;
            return bucketsLeft;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        double area = width * height;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        } else{
            int extraBuckets = getBucketCount(area, areaPerBucket);
            return extraBuckets;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        int buckets = 0;
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            double number = Math.ceil(area / areaPerBucket);
            buckets = (int)number;
        }
        return buckets;
    }
}
