public class star {
    public static void main(String[] args) {
        for (int y = 1; y <= 6; y++) {
            for (int space = 6; space > y; space--)
                System.out.print("  ");
            for (int x = 1; x <= y; x++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
