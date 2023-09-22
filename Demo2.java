public class Demo2 {
    public static void main(String[] args) {
        
        printStars(1,1);
        System.out.println();

    }

    private static void printStars(int col, int row) {
        System.out.print("*");
        col++;
        if(row == 5 && col == 6) return;

        if(col > 5) {
            System.out.println();
            col = 1;
            row++;
        }
        printStars(col, row);
        

    }
}