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