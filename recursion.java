/* 
import java.util.Scanner;


public class recursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println(fib(i)+" ");

        }

        sc.close();

    }


    static int fib(int n){
        if(n<2){

            return n;
        }

        else{
            return fib(n-1) + fib(n-2);
        }
    }
} 
*/




//binary searh using recursion

import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();

        int s=0;

        int e=n-1;


        int result =bs(arr, target, s, e);

        if(result==-1){
            System.out.println("The target elemnt is not found in the array.");
        }

        else{
            System.out.println("The target is found at the position"+result);
        }
        
        sc.close();

    }

    static int bs(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }

        int m=s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }

        else if(arr[m]>target){
            e=m-1;

        }

        else{
            s=m+1;


        }

        return bs(arr,target,s,e);

    

    }
    
}