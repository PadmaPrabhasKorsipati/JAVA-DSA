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