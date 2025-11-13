
//Palindrome check 
/* 
import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println(checkpalindrome(str));


    }

    public static boolean checkpalindrome(String str) {
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
           
        }

        return true;
        
    }
    
}

*/



//shortest distance
/* 
import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++ ){
            char current=str.charAt(i);
            if(current=='N'){
                y+=1;
            }
            else if(current=='S'){
                y-=1;
            }
            else if(current=='E'){
                x+=1;
            }
            else if(current=='W'){
                x-=1;
            }
        }

        double distance=Math.sqrt(y*y-x*x);

        System.out.println("Distance of a point:"+distance);

        sc.close();
    }
}

*/


