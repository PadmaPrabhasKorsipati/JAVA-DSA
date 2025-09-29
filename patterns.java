//inverted star pattern
/* 
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
    
}
*/

 
//Half pyramid pattern
/*
import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }

        sc.close();

    }
}
 */

/* 

//character pattern 

import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int n=sc.nextInt();
        int num=65;
        int org=num;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)num +" ");
                num+=1;
            }
            num=org;
            System.out.println();

        }
        sc.close();
    }
}
*/

/* 

//square hollow pattern

import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        sc.close();
    }

    
}

*/

/* 

//Number Triangle 

import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");

            }
            System.out.println();
        }

        sc.close();

    }
}

*/



/* 

//Number increasing pyramid pattern

import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

*/

// reverse incresing pyramid  program

import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        sc.close();
        
    }
}



