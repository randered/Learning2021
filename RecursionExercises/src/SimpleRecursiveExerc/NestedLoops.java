package SimpleRecursiveExerc;

public class NestedLoops {
    private static int numberOfLoops;
    private static int numberOfIterations;
    private static int[] loops;

    public static void main(String[] args) {
        numberOfLoops = 2;
        numberOfIterations = 3;
        loops = new int[numberOfLoops];
        Loop(0);
    }

    static void Loop(int currentLoop) {
        if (currentLoop == numberOfLoops) {
            printLoops();
            return;
        }
        for (int iterations = 1; iterations <= numberOfIterations; iterations++) {
            loops[currentLoop] = iterations;
            Loop(currentLoop + 1);
        }

    }

    public static void printLoops() {
        for (int i = 0; i < numberOfLoops; i++) {
            System.out.printf("%d ", loops[i]);
        }
        System.out.println();
    }
}
