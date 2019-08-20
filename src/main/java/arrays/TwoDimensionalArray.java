package arrays;

public class TwoDimensionalArray { //demonstrating for each loop for two dimensional array
    public static void main(String[] args) {
        int twoDim[][] = new int[5][2];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                twoDim[i][j] = (i + 1)*(j + 1);
            }
        }
        for (int row[] : twoDim){ //element of a multidimensional(N) array is an array with (N-1) dimension
            System.out.print("Row numbers: " );
            for (int num : row){
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println();
        }

        System.out.println("Sum of the array elements is: " + sum);
    }
}
