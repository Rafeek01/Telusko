public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 6;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                int number = calculatePascalNumber(i, j);
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static int calculatePascalNumber(int row, int column) {
        if (column == 0 || column == row) {
            return 1;
        } else {
            int leftNumber = calculatePascalNumber(row - 1, column - 1);
            int rightNumber = calculatePascalNumber(row - 1, column);
            return leftNumber + rightNumber;
        }
    }
}
