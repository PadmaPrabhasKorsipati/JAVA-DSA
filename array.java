

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
/* 
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

*/

/* 
//Largest element in array

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of Elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int large=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }

        for(int j=0;j<n;j++){
            if(arr[j]>large){
                large=arr[j];
            }
        }

        System.out.println("The Largest Element in the array:"+large);

        sc.close();
    }
}

*/

/* 

//Binary Search

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of Elements:");
        int n=sc.nextInt();

        System.out.print("Enter Search elemnt:");
        int target=sc.nextInt();

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

   int low=0;
   int high=n-1;
   int found=0;

   while(low<=high){
    int mid=low +(high-low)/2;
    
    if(arr[mid]==target){
        System.out.println("Element is found at index:"+mid);
        found+=1;
        break;
    }
    else if(arr[mid]<target){
        low=mid+1;


    }

    else{
        high=mid-1;

    }


   }
   
    if(found==0){
        System.out.println(" The given Element is not found in the given array ");
    }
      

 sc.close();

    }
}


*/

/* 
//Reverse  an array 


import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of Elements:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("Reversed array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}

*/


/* 
//pairs in array

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target:");
        int tar=sc.nextInt();
        System.out.print("Enter no.of Elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

        }
        int f=0;

        for(int i=0;i<n;i++){
            for(int j=i+1 ;j<n;j++){

                if((arr[i]+arr[j]==tar) && i!=j){
                    f+=1;
                    System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                }

            }

        }

        if(f==0){
            System.out.println("No Elements found");
        }
        sc.close(); 

    }
}

*/



/* 
//Sub-arrays

import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of Elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("[");
             for(int k=i;k<=j;k++){
                System.out.print(arr[k]+(k<j ? "," : ""));
             }
            System.out.println("]");
            }
            
            
        }


        
    }
}

*/



