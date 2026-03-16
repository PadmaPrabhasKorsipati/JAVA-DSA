
/* 

//Bubble Sort
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
//Time Complexity: O(n2)
//Auxiliary Space: O(1)
import java.util.Scanner;

public class sorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of Elements:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        int sort;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
         for (int i = 0; i < n - 1; i++) {
         boolean swapped=false;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                sort=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=sort;
                swapped=true;

            }

            if(!swapped){

                break;
            }
            
   }
}


System.out.println("Sorted Array:");

for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}

sc.close();
        
    }
    
}

*/


//Selection sort
//The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning.
//Time Complexity:  O(n2)
//Auxiliary Space: O(1)
/* 
import java.util.Scanner;

public class sorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of Elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;

            }

        }

        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
        }

for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}

sc.close();


    }
}



*/

    


//Insertion sort
//Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is like sorting playing cards in your hands. You split the cards into two groups: the sorted cards and the unsorted cards. Then, you pick a card from the unsorted group and put it in the right place in the sorted group.

import java.util.Scanner;

public class sorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of Elements:");
        int n = sc.nextInt();

        int temp;
        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Insertion Sort
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }

        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}