package leegayoung.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        float koreanScore = 80.5F;
        double mathScore = 50.6;
        double englishScore = 70.8;

        double totalScore = koreanScore + mathScore + englishScore;
        double averageScore = totalScore / 3;

        System.out.println("총점 : " + (int)totalScore);
        System.out.println("평균 : " + (int)averageScore);
    }
}
