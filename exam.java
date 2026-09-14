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

//print special characters
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

//no of vowels
    /**
     * exam
     */
   /*  public class exam {
    
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
    } */

// print vowels and consonants

/* import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.print("Consonants: ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c) &&
                c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
                {
                System.out.print(c + " ");}
        }

        System.out.print("\nVowels: ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                System.out.print(c + " ");
        }
    }
} */


//check character is present or not
/* import java.util.Scanner;

class SearchCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char ch = sc.next().charAt(0);

        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println(ch + " is found in string at index: " + index);
        else
            System.out.println(ch + " is not found in string");
    }
} */


//Arrange letters in alphabetical reverse order

/* import java.util.Scanner;

class ReverseAlphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (char c : a)
            System.out.print(c + " ");
    }
} */

//remove vowels from a string 
/* import java.util.Scanner;

class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
                r += c;
        }

        System.out.println("The string without vowels is: " + r);
    }
} */



//merge two sorted arrays using arraylist

/**
 * exam
 */
/* import java.util.*;
public class exam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements for 1st array:");
        int n=sc.nextInt();
        System.out.println("Enter no of elements for 2nd array:");
        int m=sc.nextInt();

        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        ArrayList<Integer> c=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }

        for(int j=0;j<m;j++){
            b.add(sc.nextInt());
        }
      
        int i=0,j=0;
        while(i<n&&j<m){
            
            if(a.get(i)<=b.get(j)){

                c.add(a.get(i));
                i++;
            
            }
            else{
                c.add(b.get(j));
                j++;

            }
        }
        while(i<n){
            c.add(a.get(i));
            i++;
        }
        while(j<m){
            c.add(b.get(j));
            j++;
        }

        for(int k:c){
            System.out.print(k+" ");
        }



    }
} */

//mean median mode 

/* 
import java.util.*;

public class exam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        Arrays.sort(a);

        double mean=(double) sum/n;

        double median=0;

        if(n%2==0){
            median=(a[n/2-1] +a[n/2])/2.0;
        }
        else{
            median=a[n/2];
        }

        int mode=a[0];
        int max=0;
        

        for(int i=0;i<n;i++){
            int count=1;

            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }

            if(max<count){
                max=count;
                mode=a[i];
            }
        }

         System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
 

        

        

        
    }

    
} */

/* import java.util.*;

class CompositeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int factors = 0;

            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0)
                    factors++;
            }

            if (factors > 2)
                count++;
        }

        System.out.println("Number of Composite Numbers = " + count);
    }
} */

//reverse number using loop 

/* import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = 0;


        while(n!=0){
            int remainder=n%10;

            rev=rev*10 +remainder;

            n=n/10;

        }

        System.out.println("Reversed number:"+rev);

}

} */


//convert deciimal to binary and reverse binary to decimal

import java.util.Scanner;

/**
 * exam
 */
public class exam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        int n=sc.nextInt();

        int binary=0;
        int place=1;

        while(n>0){
            int digit=n%2;

            binary+=binary*place+digit;

            place*=10;
            n/=2;
        }

        int reverse=0;
        while(binary>0){
            reverse=reverse*10 + binary%10;
            binary/=10;
        }

        int decimal=0;
        int power=1;

        while(reverse>0){
            decimal+=(decimal%10)*power;
            power*=2;
            reverse/=10;

        }

        System.out.println(decimal);
    }
}