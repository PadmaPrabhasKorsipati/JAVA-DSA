/*
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        
        swap(a,b);
        System.out.println("a:" + a +" , b:"+ b);
    }


    static void swap(int a,int b){
        int temp=b;
        b=a;
        a=temp;

        System.out.println("a:" + a +" , b:"+ b);
    }
    
}
 */
/* 
public class functions {

    public static void main(String[] args) {
        String name="Prabhas";
        greet(name);
    }

    public static void greet(String naam) {
        naam="gameover";
        System.out.println(naam);

        
    }
}

*/



//Questions

//Prime Numbers
/* 
import java.util.Scanner;

public class functions {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number:");
      
        int num=sc.nextInt();

       for(int j=100;j<1000;j++){
        if(isarmstrong(j)){
            System.out.println(j+" ");
        }
       }


        
    }


    static void isprime(int num){
       int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=1;

            }

        }

        if(sum<3){
            System.out.println("The given Number is a Prime Number.");
        }

        else{
            System.out.println("The given Number is not a Prime Number.");
        }
    }



    static boolean isarmstrong(int num){
        int a=num;
        int sum=0;
        double cube=0;

        while(a>0){
            int rem=a%10;
            cube=Math.pow(rem,3);
            sum+=cube;
            a=a/10;

        }

        if(num==sum){
           return true;
        }

        return false;

        
    }


}

*/

/* 
public class functions {

    public static void main(String[] args) {
    int[] arr={1,2,3,4};

    swap(arr,1,2);
    System.out.println(arr[1]+" "+arr[2]);


    }

    public static void swap(int[] ar,int index1,int index2 ){
      int temp=ar[1];
      ar[1]=ar[2];
      ar[2]=temp;

    }
}

*/

//Maximum Element in an array


public class functions {

    public static void main(String[] args) {
        
    }
}

