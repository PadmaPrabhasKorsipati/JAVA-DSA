/* 
// creating a 2d array
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of Rows:");
        int rows=sc.nextInt();
        System.out.print("Enter no.of Columns:");
        int columns=sc.nextInt();

        int[][] arr=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();

         
    }
}
*/


//spiral matrix

import java.util.Scanner;

public class twodarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         System.out.print("Enter no.of Rows:");
        int rows=sc.nextInt();
        System.out.print("Enter no.of Columns:");
        int columns=sc.nextInt();

        int[][] matrix=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Spiral form");
        printSpiral(matrix, rows, columns);

        }



static void printSpiral(int[][] arr, int rows, int cols) {
        int top=0; int right=columns-1;
        int bottom=rows-1; int left=0;
        

        while(top<=bottom && right<=left){

            //print left to right

            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i] + " ");
            }
            top ++;

            //print top to bottom

            for(int i=top;i<=bottom;i++){
                System.out.println(arr[i][right]+" ");

            }
            right--;

            //print right to left

            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;

            //print bottom to top 

            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left]);
            }

            left++;





        }



}


  }  