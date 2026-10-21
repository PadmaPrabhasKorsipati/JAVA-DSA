/* public class bitwise {

    public static void main(String[] args) {
       int[] arr={2,3,4,4,3,7,2};

       System.out.println(ans(arr));
        
    }

    private static int ans(int[] arr){
            int unique=0;

        for(int n:arr){
            unique ^=n;
        }

        return unique;
    }


    
}
 */

//ith bit of the given number

/* 
import java.util.*;

public class bitwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();

        int bit = 1 << (i - 1);
        int num = n & bit;

        System.out.println(num != 0 ? 1 : 0);

        sc.close();
    }
}
 */
//right most set bit

/* 
import java.util.Scanner;

public class bitwise{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = n & (-n);

        System.out.println(result);

        sc.close();
    }
}
 */



/* //nth magic number

import java.util.Scanner;

public class bitwise {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int power=5;

        int ans=0;


        while(n>0){
            int pos=n & 1;
            ans+=pos*power;
            n=n>>1;

            power*=5;

            
        }

        System.out.println(ans);
        



    }
} */



//prime number

import java.util.Scanner;

/**
 * bitwise
 */
public class bitwise {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();


        int c=2;

        boolean p=true;


        while(c*c<=n){
            if(n%c==0){
                System.out.println("It is not prime");
                p=false;
                break;

              
            }

            c++;
        }

        if(p)

            System.out.println("It is prime");



    
    }
}