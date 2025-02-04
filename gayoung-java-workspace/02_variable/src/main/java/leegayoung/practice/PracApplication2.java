package leegayoung.practice;

public class PracApplication2 {
    public static void main(String[] args) {
        double width = 12.5;
        double height  = 36.4;

        double quadArea = width * height;
        double quadMeter = (width + height) * 2;

        System.out.printf("면적: %.1f\n", quadArea);
        System.out.printf("둘레: %.1f", quadMeter);

    }
}
