
//Bubble Sort

/**
 * sorting
 */
import java.util.*;
public class sorting {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

       System.out.println(BubbleSort(arr)); 

        sc.close();
    }

    static String BubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }

            }
        }

        return Arrays.toString(arr);
    }

    
}