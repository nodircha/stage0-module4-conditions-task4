package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(third > (first > second ? first : second) ? third : ((first > second) ? first : second));
    }
}
