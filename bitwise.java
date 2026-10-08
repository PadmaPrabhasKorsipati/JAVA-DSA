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

import java.util.Scanner;

public class bitwise {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int target=sc.nextInt();

    String num="";


    while(n>0){
        int remainder=n%2;
        num+=remainder;
        n/=2;

    }

    String rev="";


    for(int i=num.length()-1;i>=0;i--){

        rev+=num.charAt(i);


    }

 System.out.println(rev.charAt(target-1));

}    
}