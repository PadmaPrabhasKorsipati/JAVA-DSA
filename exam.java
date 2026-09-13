//fibonacci
/* 
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int f=0;
        int s=1;
        int p=0;

        for(int i=0;i<n;i++ ){

            System.out.print(p+" ");


            p=f+s;

            f=s;
            s=p;

        }

        sc.close();
    }
    
} */

 //gcd,lcm

/* import java.util.Scanner;


    
    public class exam {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int a=sc.nextInt();
            int b=sc.nextInt();
            int gcd=0;
   
            int c=(a>b) ? a:b;
         

            for(int i=1;i<=c;i++){
                if(a%i==0 && b%i==0){
                    gcd=i;
                }
            }

    

            System.out.println("GCD is:"+gcd);



            
        }
    } */


//lcm

import java.util.Scanner;

/**
 * Innerexam
 */
public class exam {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

            int a=sc.nextInt();
            int b=sc.nextInt();
            int lcm=(a>b) ?a:b;

            while(lcm % a != 0 || lcm % b != 0){
                lcm++;
            }
    System.out.println(lcm);

        
    }

    
}