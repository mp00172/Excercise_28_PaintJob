public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if((width <= 0 || height <= 0 || areaPerBucket <= 0) || extraBuckets < 0) {
            return -1;
        }
        double areaToCover = width * height;
        double extraBucketCoverage = areaPerBucket * extraBuckets;
        double areaLeftToCover = areaToCover - extraBucketCoverage;
        return (int) Math.ceil(areaLeftToCover / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaToCover = width * height;
        return (int) Math.ceil(areaToCover / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
