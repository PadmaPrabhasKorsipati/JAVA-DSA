

//binary searh using recursion

/* import java.util.Scanner;

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
    
} */


// RETURN n to 1

/* import java.util.Scanner;


public class recursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        num(n);


    }


    static void num(int n){
        if(n==0){
            return ;
        }

        System.out.println(n);

        num(n-1);
    }
}
 */


//factorial of n
/* import java.util.*;
public class recursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();


        System.out.println(fact(n));



    }

  
   
    static int fact(int n){

        if(n<=1){
            return 1;
        }

    

        return n*fact(n-1);
    


    
    }
} */


//sum of digits 

import java.util.ArrayList;
import java.util.Arrays;

/**
 * recursion
 */
/* import java.util.*;
public class recursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

System.out.println(sum(n));
    }

    static int sum(int n){

        if(n<=1){
            return 1;
        }
       int rev=n%10;

       n/=10;

       return rev*sum(n);


    }
    
} */

 //reverse a number 

/* import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rev(n);
        System.out.println(sum);
        
    }

   static  int  sum=0;
    static  void rev(int n){

        if(n==0){
            return ;
        }

        int rev=n%10;

        sum=sum*10 + rev;

        n/=10;

        rev(n);
        
    }
} */



//palindrome

/* import java.util.*;
public class recursion {

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         
        if(n<0){
            System.out.println(false);
            return;
        }

        int divisor=1;

        while(n/divisor>=10){
            divisor*=10;
        }

        System.out.println(pal(n, divisor));
        
    }

   static boolean pal(int n,int divisor){

    if (n==0) return true;

    int leading=n/divisor;

    int trailing=n%10;

    if(leading!=trailing){
        return false;
    }

    return pal((n%divisor)/10,divisor/=100);




   }


} */

//count zeros
/* import java.util.*;
public class recursion {

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        System.out.println(count(n,0));


         
    }

    static int count(int n,int sum){
         
       
        if(n==0){
            return sum;
        }

        int rev=n%10;
       if(rev==0)
        return count(n/10,sum+1);

       else

        return count(n/10, sum);

    }

} */




//Arrays


//check array is sorted or not


/* public class recursion {

    public static void main(String[] args) {

        int arr[]={1,2,3,5,6};

        System.out.println(check(arr, 0));


        
    }

    static boolean check(int[] arr,int i){

        if(i>=arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1] ){
            return false;
        }


        return check(arr, i+1);


    }
} */



//linear search


/*  public class recursion {

    public static void main(String[] args) {

        int arr[]={1,3,2,3,5,6};
        
        System.out.println(indexall(arr, 3,0 ));


        
    }


    static ArrayList<Integer> indexall(int[] arr,int target,int i){
        ArrayList<Integer> list =new ArrayList<>(); 
        if(i>=arr.length){
            return list;
        }

        if(arr[i]== target)
           list.add(i);
        

        ArrayList<Integer> ansBelow=indexall(arr, target, i+1);

        list.addAll(ansBelow);

        return list;


        


    }
} */


//binary search


/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        
        System.out.println(bsearch(arr, 4, 0, arr.length-1));
        
    }


    static int bsearch(int[] arr,int target,int s,int e){

        int mid=s + (e-s)/2;
        
         if(s>e){

            return -1;

        }
       
        if(arr[mid]==target){
            return mid;
        }

        else if(arr[mid]>target){
            return bsearch(arr, target, s, mid-1);
        }

        else{
            return bsearch(arr, target, mid+1, e);
        }

        
    }
} */



//normal triangle

/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {

        print(0, 0, 4);
        
    }

    static void print(int r,int c,int n){

        if(r==n-1){
            return;
        }

        if(r<c){

            System.out.print('*');
             print(r, c+1, n);
        }

        else{
            System.err.println();

            print(r+1, 0, n);
        }
    }
} */


//bubble sort


/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {
        int[] arr={3,2,7,9,5};

        System.out.println(Arrays.toString(bubblesort(arr, arr.length-1,0,false)));


    }


    static int[] bubblesort(int[] arr,int i,int j,boolean swapped){

    if(i==0){
        return arr;
    }

    if(j<i){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];

            arr[j]=arr[j+1];

            arr[j+1]=temp;
            swapped=true;
        }
        return bubblesort(arr, i, j+1,swapped);
    }

    else{

        if(!swapped){
            return arr;
        }
        return bubblesort(arr, i-1, 0,false);
    }

    




    }
}



 */


//selective sort


/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {

        int[] arr={47,25,8,49,23,30,39};

        System.out.println(Arrays.toString(selecsort(arr, 0, 0,0)));
        
    }

    static int[] selecsort(int[] arr,int i,int j,int minindex){

        if(i==arr.length-1){

            return arr;
        }

        if(j<arr.length){
            if(arr[j]<arr[minindex]){
                minindex=j;
            }

            return selecsort(arr, i, j+1, minindex);
        }

        else{

            int temp=arr[i];

            arr[i]=arr[minindex];

            arr[minindex]=temp;


            return selecsort(arr, i+1, j+2, i+1);




        }

    }
}

 */

//MERGE SORT

/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {

        int[] arr={3,2,9,5,1,8,7};

        mergesort(arr);

        System.out.println(Arrays.toString(arr));
        
    }


    private static void mergesort(int[] arr){

        int length=arr.length;

        if(length<=1){
            return;
        }

        int mid=length/2;

        int[] leftarray=new int[mid];

        int[] rightarray=new int[length-mid];

        int i=0;
        int j=0;

        for(;i<length;i++){

            if(i<mid){
                leftarray[i]=arr[i];
            }

            else{
                rightarray[j]=arr[i];
                j++;
            }

        }


        mergesort(leftarray);

        mergesort(rightarray);


        merge(leftarray,rightarray,arr);



    }


    private static void merge(int[]leftarray,int[] rightarray,int[] arr) {

    
        int l=arr.length/2;

        int r=arr.length -l;

        int i=0,j=0,k=0;

        while (i<l && j<r) {

            if(leftarray[i]<rightarray[j]){
                arr[k]=leftarray[i];
                i++;
            }

            else{
                arr[k]=rightarray[j];

                j++;
            }

            k++;
            
        }


        while(i<l){
            arr[k]=leftarray[i];
            i++;
            k++;
        }

        while (j<r) {
            arr[k]=rightarray[j];

            j++;
            k++;

            
        }



        
    }
} */


//quick sort


/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {

        int[] arr={2,8,5,3,9,4,5};

        quicksort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
        
    }

    private static void quicksort(int[] arr, int start, int end) {

        if(start>=end){
            return;
        }

        int pivot=partition(arr,start,end);

        quicksort(arr, start, pivot-1);

        quicksort(arr, pivot+1,end);

        

    
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot=end;

        int i=start-1;

        for(int j=start;j<=end-1;j++){
            if(arr[j]<arr[pivot]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

        i++;

        int temp=arr[i];
        arr[i]=arr[pivot];
         arr[pivot]=temp;


        return i;


       
    }

} */






//merge sort


/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {

        int[] arr={6,5,12,10,9,1};

        mergesort(arr);

        System.out.println(Arrays.toString(arr));
        
    }

    private static void mergesort(int[] arr) {
        
        int length=arr.length;

        if(length<=1){
            return;
        }

        int mid=arr.length/2;

        int[] leftarr=new int[mid];

        int[] rightarr=new int[length-mid];

        int i=0;

        int j=0;

        for(;i<length;i++){
            if(i<mid){
                leftarr[i]=arr[i];
            }

            else{
                rightarr[j]=arr[i];

                j++;
            }
        }


        mergesort(leftarr);

        mergesort(rightarr);

        merge(leftarr,rightarr,arr);
        
    }

    private static void merge(int[] leftarr, int[] rightarr, int[] arr) {

        int leftsize=arr.length/2;

        int rightsize=arr.length-leftsize;

        int l=0,r=0,k=0;

        while(l<leftsize && r<rightsize){

            if(leftarr[l]<rightarr[r]){
                arr[k]=leftarr[l];
                l++;
            }

            else{
                arr[k]=rightarr[r];
                r++;
            }

            k++;
        }

        while (l<leftsize) {

            arr[k]=leftarr[l];

            l++;
            k++;
        }

        while(r<rightsize){
            arr[k]=rightarr[r];

            r++;
            k++;
        }




       
    }



} */




//quick sort

/**
 * recursion
 */
/* public class recursion {

    public static void main(String[] args) {
        int[] arr={6,5,12,10,9,1};

        quicksort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
        
    }

    private static void quicksort(int[] arr,int start,int end) {

        if(start>=end){
            return;
        }

        int pivot=partition( arr, start, end);

        quicksort(arr, start, pivot-1);

        quicksort(arr, pivot+1, end);

        
        
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot=arr[end];

        int i=start-1;

        for(int j=start;j<end;j++){

            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
          int temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;


    return i;


        
    }



} */




//remove letter 


/**
 * recursion
 */

/* public class recursion {

    public static void main(String[] args) {

        String word="bacaadd";

        skip("",word);

       
        
    }

    private static void skip(String p, String unp) {

        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=unp.charAt(0);

        if(Character.toLowerCase(ch)=='a'){

            skip(p,unp.substring(1));

        
        }

        else{

            skip(p+ch,unp.substring(1));
        }

    
        
    }


    
} */




//fibonacci using recursion
import java.util.*;
public class recursion {

    public static void main(String[] args) {

        int n=5;
        
        System.out.println(fib(5));

        
    }

    static int fib(int n){
        if(n==0){
            return 0;
        }

        if(n==1){

            return 1;


        }

        return fib(n-1)+fib(n-2);
    }

    
}
