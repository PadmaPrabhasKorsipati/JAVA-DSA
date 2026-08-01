//create an arrray of seven elements 
//create an arrray of threee elements and now find weight
//1 2 3 3 3 4 4
//1 2 3

/**
 * devscops
 */

/* import java.util.*;
public class devscops {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr1=new int[7];

        int[] arr2=new int[3];


        for(int i=0;i<7;i++){
            arr1[i]=sc.nextInt();
            
        }

        for(int i=0;i<3;i++){
            arr2[i]=sc.nextInt();
        }

        for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<7;j++){
                if(arr2[i]==arr1[j]){
                    count+=1;
                    
                }
            }
            System.out.println(arr2[i]+" occured "+count+" times");
            
        }
        sc.close();


    }
} */


//2d array

/**
 * devscops
 */
import java.util.*;
public class devscops {
    public static void main(String[] args) {
    
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++){
            System.out.println(arr[i][i]);
        }
    }

    
}