/* 
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }

         System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    

    
}
*/



//Linear Search 

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n=sc.nextInt();
         System.out.print("Enter element to search:");
         int search=sc.nextInt();

         int sum=0;
         int pos=0;

         int[] arr=new int[n];

         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

         }

         for(int j=0;j<n;j++){
            if(arr[j]==search){
              pos=j;
              break;

            }

          

         }

         
            if(pos!=-1){  System.out.println(search+" is found at index "+pos);}
            
            else{System.out.println(search+" is not found.");}



         sc.close();
        
    }
}

