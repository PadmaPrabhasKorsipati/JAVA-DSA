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

/* import java.util.Scanner;

/**
 * Innerexam
 */
/* public class exam {
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

    
} */ 



//reverse word

/* import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);

        String s=sc.nextLine();

        String r="";

        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);

        }

        System.out.println("Reversed string is:"+r);
    }
} */


//string to integer

import java.util.Scanner;

/**
 * exam
 */
/* public class exam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        try{
            int n=Integer.parseInt(s);
            System.out.println("output integer is:"+n);
        }

        catch(Exception e){
            System.out.println("Invalid input");
        }


    }
} */




/**
 * exam
 */
/* public class exam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the username:");
        String s1=sc.nextLine();

        System.out.println("Reenter the username:");
        String s2=sc.nextLine();

        if(s1.equals(s2)){
            System.out.println("Username is valid.");

        }
        else{
            System.out.println("Username is invalid.");
        }


    }
} */

//sort in alphabetical order

/**
 * exam
 */
/* public class exam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of names:");
         int n = sc.nextInt();
        sc.nextLine();

        String[] a = new String[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        System.out.print("Order (A/D): ");
        char ch = sc.next().charAt(0);

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((ch=='A' && a[i].compareTo(a[j])>0)||(ch=='D' && a[i].compareTo(a[j])<0)){
                 String temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;

                }
            }
        }

        for(String name:a){
            System.out.println(name);
        }
    }
} */


/**
 * exam
 */
/* public class exam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int count=0;

        System.out.println("Special Characters:");

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(!Character.isLetterOrDigit(c)&& c!=' '){
                System.out.print(c+" ");
                count+=1;
            }
        }

        System.out.println("\n Number of special characters:"+count);
    }
} */


    /**
     * exam
     */
    public class exam {
    
        public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for(int i=0;i<s.length();i++){
            char c=Character.toLowerCase(s.charAt(i));

            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                count+=1;
                
            }


        }

        System.out.println("No of vowels:"+count);

            
        }
    }