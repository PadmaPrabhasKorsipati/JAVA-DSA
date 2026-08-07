
//Bubble Sort

/**
 * sorting
 */
/* import java.util.*;
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

        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                   int  temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;

                }


            }
            if(!swapped){
                break;
            }
        }

        return Arrays.toString(arr);
    }

    
} */


//selection sort

/**
 * sorting
 */
/* import java.util.*;
public class sorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println(Selectionsort(arr));

        sc.close();
        
    }

   static String Selectionsort(int[] arr){

    for(int i=0;i<arr.length-1;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min=j;
            }

        }

        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;

    }

    return Arrays.toString(arr);


   }


    
} */



//insertion sort

/* import java.util.*;
public class sorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();


        }

        System.out.println(InsertionSort(arr));

        sc.close();

    }

    static String InsertionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j>0;j--){

                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

                else{
                    break;
                }

            }

            
           
        }

        return Arrays.toString(arr);


    }


} */


//cyclic sort


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

        System.out.println(CyclicSort(arr));

        sc.close();
        
    }

    static String CyclicSort(int[] arr){

        int i=0;

        while(i<arr.length){

            int correct=arr[i]-1;

            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;

            }

            else{
                i++;
            }
        }

        return Arrays.toString(arr);


        
    }




}