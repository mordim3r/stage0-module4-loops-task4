package school.mjc.stage0.loops.task4;

public class FixMe {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 8) {
                break;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if (i == 6) {
                System.out.print("last ");
                System.out.print("will I be printed?");
                break;
            }
        }
    }
}