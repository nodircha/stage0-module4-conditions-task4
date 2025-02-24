package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result=10;
        result = first > second?
                result:
                -(result);
        System.out.println(result);
    }
}
