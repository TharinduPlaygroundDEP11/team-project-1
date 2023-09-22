public class Demo {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = x; j > 0; j--) {
                System.out.print("* ");
            }
            x--;
            System.out.println();
        }
    }
}