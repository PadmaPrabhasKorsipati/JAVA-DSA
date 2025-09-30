
//Bubble Sort
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 

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
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                sort=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=sort;

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
